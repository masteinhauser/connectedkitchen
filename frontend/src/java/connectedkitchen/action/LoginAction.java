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
@UrlBinding("/login.action")
public class LoginAction extends _Action {
    private static final String VIEW = "/home.jsp";

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
        
        // Need to add username and password verification. 
        
        // For now we'll simply set them as a hardcoded user.
        UserEntity userEntity = new UserEntity();
        userEntity = new User().getUser(email, pass);
        context.setUser(userEntity);
        
        // User has been logged in, forward them to userHome
        return new ForwardResolution(connectedkitchen.action.HomeAction.class, "login");
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
