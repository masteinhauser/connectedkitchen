package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/user.action")
public class UserAction extends _Action {
    private static final String FORM = "/userForm.jsp";
    
    private String action;
    private String firstName, lastName;
  
    @DefaultHandler
    public Resolution view() {
        action = "New";
        return new ForwardResolution(FORM);
    }
    
    public Resolution register() {
        action = "Edit";
        return new ForwardResolution(HomeAction.class, "register");
    }
    
    public String getAction(){
        return action;
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
