package spring.service.testcodes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.service.common.BaseObjectServiceImpl;
import us.mn.state.health.lims.testcodes.dao.OrganizationHL7SchemaDAO;
import us.mn.state.health.lims.testcodes.valueholder.OrganizationHL7Schema;
import us.mn.state.health.lims.testcodes.valueholder.OrganizationSchemaPK;

@Service
public class OrganizationHL7SchemaServiceImpl extends BaseObjectServiceImpl<OrganizationHL7Schema, OrganizationSchemaPK>
		implements OrganizationHL7SchemaService {
	@Autowired
	protected OrganizationHL7SchemaDAO baseObjectDAO;

	OrganizationHL7SchemaServiceImpl() {
		super(OrganizationHL7Schema.class);
		defaultSortOrder = new ArrayList<>();
	}

	@Override
	protected OrganizationHL7SchemaDAO getBaseObjectDAO() {
		return baseObjectDAO;
	}
}
