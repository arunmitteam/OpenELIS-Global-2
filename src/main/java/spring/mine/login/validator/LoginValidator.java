package spring.mine.login.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.mine.common.validator.ValidationHelper;
import us.mn.state.health.lims.common.action.IActionConstants;
import us.mn.state.health.lims.login.valueholder.Login;

@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Login.class.equals(clazz);
	}

	// basic validation at any point in execution
	@Override
	public void validate(Object target, Errors errors) {
		Login login = (Login) target;

		ValidationHelper.validateFieldAndCharset(login.getLoginName(), "loginName", errors, true, 20,
				"a-zA-Z0-9_@�������������������������Ԍ��ܟ�");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "login.password.error");
	}

	// validate before persisting for the first time
	// TODO needs expansion
	public void preInsertValidate(Login login, Errors errors) {
		validate(login, errors);
	}

	// validate before updating
	// TODO possibly needs expansion
	public void preUpdateValidate(Login login, Errors errors) {
		validate(login, errors);
		// validate password expired day
		// bugzilla 2286
		if (login.getPasswordExpiredDayNo() <= 0) {
			errors.reject("login.error.password.expired");
		}
		// validate user id exists in system_user table
		if (login.getSystemUserId() == 0) {
			errors.reject("login.error.system.user.id", login.getLoginName());
		}
	}

	// complex validation for password update when user is not authenticated (ie
	// /UpdateLoginChangePassword.do)
	public void unauthenticatedPasswordUpdateValidate(Login login, Errors errors) {
		preUpdateValidate(login, errors);

		// validate account disabled
		if (login.getAccountDisabled().equals(IActionConstants.YES)) {
			errors.reject("login.error.account.disable");
		}
		// validate account locked
		if (login.getAccountLocked().equals(IActionConstants.YES)) {
			errors.reject("login.error.account.disable");
		}
	}

}
