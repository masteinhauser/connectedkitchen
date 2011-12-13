package connectedkitchen.action;

import connectedkitchen.model.User;
import connectedkitchen.persistence.entities.UserEntity;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.ValidationErrors;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/security.action")
public class SecurityAction extends _Action {
    private static final String VIEW = "/login.jsp";

    private String email, pass;
    
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }
    
    public Resolution login() {        
        // Check to see they actually entered login info.
        if(email == null || pass == null){
            ValidationErrors errors = new ValidationErrors();
            errors.add( "authentication", new SimpleError("Please fill in email and password.") );
            getContext().setValidationErrors(errors);
            
            return getContext().getSourcePageResolution();
        }
        
        // Look up the user in the current user list.
        UserEntity user = User.getInstance().getUser(email, pass);
        
        // If the user is not found, redirect back to the page they came from with an error response.
        if(user.getId() == null){
            ValidationErrors errors = new ValidationErrors();
            errors.add( "authentication", new SimpleError("Invalid email or password.") );
            getContext().setValidationErrors(errors);
            
            return getContext().getSourcePageResolution();
        }
            
        // Set the user to the session for easy retrieval.
        // NOTE: This would be a HUGE security flaw.
        context.setUser(user);

        // User has been logged in, forward them to userHome
        return new ForwardResolution(connectedkitchen.action.HomeAction.class, "login");
    }
    
    public Resolution logout(){
        context.clearSession();
        message = "You have been logged out.";
        
        return new ForwardResolution(VIEW);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
