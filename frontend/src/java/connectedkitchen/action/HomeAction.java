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
    private static final String HOME = "/userHome.jsp";
    
    private String message;
    
    @DefaultHandler
    public Resolution view() {
        message = "";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution login() {
        message = "<h3>Thanks for logging in!</h3> <br /> Once this page is complete"
                + " it'll contain a list of favorite recipes, as well as "
                + " an alert if applicable to items that need to be restocked"
                + " in the kitchen.";
        return new ForwardResolution(HOME);
    }
    
    public Resolution register() {
        message = "<h3>Thank you for registering!</h3><br />"
                + "When complete, this page will display links to getting started"
                + " help files.";
        return new ForwardResolution(HOME);
    }
    
    public String getMessage(){
        return message;
    }
}
