package spring.generated.forms;

import java.util.List;

import spring.mine.common.form.BaseForm;

public class TypeOfSampleTestMenuForm extends BaseForm {
  private List menuList;

  private String[] selectedIDs;

  public TypeOfSampleTestMenuForm() {
    setFormName("typeOfSampleTestMenuForm");
  }

  public List getMenuList() {
    return this.menuList;
  }

  public void setMenuList(List menuList) {
    this.menuList = menuList;
  }

  public String[] getSelectedIDs() {
    return this.selectedIDs;
  }

  public void setSelectedIDs(String[] selectedIDs) {
    this.selectedIDs = selectedIDs;
  }
}
