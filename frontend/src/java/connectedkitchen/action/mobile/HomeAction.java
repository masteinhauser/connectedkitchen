package connectedkitchen.action.mobile;

import connectedkitchen.action.*;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/m/home.action")
public class HomeAction extends _Action {
    private static final String VIEW = "/WEB-INF/m/home.jsp";
    
    private String message;
    
    @DefaultHandler
    public Resolution view() {
        message = "Is this thing on?!?";
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
