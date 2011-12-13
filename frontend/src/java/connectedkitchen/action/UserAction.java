package connectedkitchen.action;

import connectedkitchen.model.User;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/user.action")
public class UserAction extends _Action {
    private static final String FORM = "/userForm.jsp";
    
    private String action;
    private String emailAddress, password, firstName, lastName;
  
    @DefaultHandler
    public Resolution view() {
        action = "New";
        return new ForwardResolution(FORM);
    }
    
    public Resolution register() {
        User user = new User(emailAddress, password);
        
        // Set extra information.
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAdmin(false);
        
        // Set the user to the session for easy retrieval.
        // NOTE: This would be a HUGE security flaw.
        context.setUser(user);
        
        return new ForwardResolution(connectedkitchen.action.HomeAction.class, "register");
    }
    
    public String getAction(){
        return action;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
