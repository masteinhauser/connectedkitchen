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
    private static final String VIEW = "/login.jsp";
    private static final String HOME = "/userHome.jsp";
    
    private String message;
    
    @DefaultHandler
    public Resolution view() {
        if(context.getLoginType().equals(LoginType.ADMIN) || context.getLoginType().equals(LoginType.USER)){
            message = "This is your home as a user!";
            return new ForwardResolution(HOME);
        }
        message = "";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution login() {
        message = "<h3>Thanks for logging in!</h3> <br /> Once this page is complete"
                + " it will contain a list of favorite recipes, as well as "
                + " an alert of applicable items that need to be restocked"
                + " in the kitchen.";
        return new ForwardResolution(HOME);
    }
    
    public Resolution register() {
        message = "<h3>Thank you for registering!</h3><br />"
                + "When complete, this page will display links to getting started"
                + " help files.";
        return new ForwardResolution(HOME);
    }
    
    public Resolution edit() {
        message = "Your Profile has been updated.";
        return new ForwardResolution(HOME);
    }
    
    public String getMessage(){
        return message;
    }
}
