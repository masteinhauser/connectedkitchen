package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/inventory.action")
public class InventoryAction extends _Action {
    private static final String VIEW = "/inventory.jsp";
    
    private String message;
    
    @DefaultHandler
    public Resolution view() {
        message = "No Message";
        return new ForwardResolution(VIEW);
    }
    
    public String getMessage(){
        return message;
    }
}
