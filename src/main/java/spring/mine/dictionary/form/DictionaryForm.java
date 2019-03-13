package spring.mine.dictionary.form;

import java.util.Collection;

import spring.mine.common.form.BaseForm;
import us.mn.state.health.lims.dictionarycategory.valueholder.DictionaryCategory;

public class DictionaryForm extends BaseForm {
	private String id = "";

	private String selectedDictionaryCategoryId = "";

	private DictionaryCategory dictionaryCategory;

	private Collection categories;

	private String isActive = "";

	private String dictEntry = "";

	private String localAbbreviation = "";

	private String dirtyFormFields = "";

	private boolean newDictionary;

	public DictionaryForm() {
		setFormName("dictionaryForm");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSelectedDictionaryCategoryId() {
		return selectedDictionaryCategoryId;
	}

	public void setSelectedDictionaryCategoryId(String selectedDictionaryCategoryId) {
		this.selectedDictionaryCategoryId = selectedDictionaryCategoryId;
	}

	public DictionaryCategory getDictionaryCategory() {
		return dictionaryCategory;
	}

	public void setDictionaryCategory(DictionaryCategory dictionaryCategory) {
		this.dictionaryCategory = dictionaryCategory;
	}

	public Collection getCategories() {
		return categories;
	}

	public void setCategories(Collection categories) {
		this.categories = categories;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getDictEntry() {
		return dictEntry;
	}

	public void setDictEntry(String dictEntry) {
		this.dictEntry = dictEntry;
	}

	public String getLocalAbbreviation() {
		return localAbbreviation;
	}

	public void setLocalAbbreviation(String localAbbreviation) {
		this.localAbbreviation = localAbbreviation;
	}

	public String getDirtyFormFields() {
		return dirtyFormFields;
	}

	public void setDirtyFormFields(String dirtyFormFields) {
		this.dirtyFormFields = dirtyFormFields;
	}

	public boolean isNewDictionary() {
		return newDictionary;
	}

	public void setNewDictionary(boolean newDictionary) {
		this.newDictionary = newDictionary;
	}
}
