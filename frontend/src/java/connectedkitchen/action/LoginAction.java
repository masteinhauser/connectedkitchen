package connectedkitchen.action;

import connectedkitchen.persistence.entities.User;
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
       
        
        // We should not check the username against the database and if the user is found and the password matches, log them in. 
        
        
        // For now we'll simply set them as a hardcoded user.
        User user = new User(1, true);  // UserID is 1 and they are an Admin
        context.setUser(user);
        
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
