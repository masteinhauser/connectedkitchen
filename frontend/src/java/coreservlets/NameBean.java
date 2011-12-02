package coreservlets;

public class NameBean {
  private String firstName = "Missing first name";
  private String lastName = "Missing last name";

  public NameBean() {}

  public NameBean(String firstName, String lastName) {
    setFirstName(firstName);
    setLastName(lastName);
  }
  
  public String getFirstName() {
    return(firstName);
  }
  
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  public String getLastName() {
    return(lastName);
  }
  
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
}
