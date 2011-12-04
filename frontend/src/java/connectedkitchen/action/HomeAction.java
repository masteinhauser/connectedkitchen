package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/home.action")
public class HomeAction extends _Action {
    private static final String VIEW = "/home.jsp";
    
    private String message;
    
    @DefaultHandler
    public Resolution view() {
        message = "";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution login() {
        message = "Thanks for logging in!";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution register() {
        message = "Thanks for registering!";
        return new ForwardResolution(VIEW);
    }
    
    public String getMessage(){
        return message;
    }
}
