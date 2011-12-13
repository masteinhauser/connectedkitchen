package connectedkitchen.action;

import connectedkitchen.model.User;
import connectedkitchen.persistence.entities.UserEntity;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/user.action")
public class UserAction extends _Action {
    private static final String FORM = "/userForm.jsp";
    
    private String action, type;
    private String emailAddress, password, firstName, lastName;
  
    @DefaultHandler
    public Resolution view() {
        UserEntity user = context.getUser();
        type = "register";
        if(user != null){
            firstName = user.getFirstName();
            lastName = user.getLastName();
            emailAddress = user.getEmailAddress();
            type = "edit";
        }
        return new ForwardResolution(FORM);
    }
    
    public Resolution edit() {
        // Get instance of the Singleton
        User user = User.getInstance();
        // Create the user
        UserEntity ue = new UserEntity(emailAddress, password);
        
        // Set extra information.
        ue.setFirstName(firstName);
        ue.setLastName(lastName);
        ue.setAdmin(false);
        
        // Save the information we just added.
        user.saveUser(ue);
        
        // Set the user to the session for easy retrieval.
        context.setUser(ue);
        
        return new ForwardResolution(connectedkitchen.action.HomeAction.class, "edit");
    }
    
    public Resolution register() {
        // Get instance of the Singleton
        User user = User.getInstance();
        // Create the user
        UserEntity ue = new UserEntity(emailAddress, password);
        
        // Set extra information.
        ue.setFirstName(firstName);
        ue.setLastName(lastName);
        ue.setAdmin(false);
        
        // Save the information we just added.
        user.saveUser(ue);
        
        // Set the user to the session for easy retrieval.
        context.setUser(ue);
        
        return new ForwardResolution(connectedkitchen.action.HomeAction.class, "register");
    }
    
    public String getAction(){
        return action;
    }
    
    public String getType(){
        return type;
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
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "Unknown" : firstName;
    }

    public String getLastName() {
        return lastName ;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "Unknown" : lastName;
    }
}
