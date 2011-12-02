package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class InventoryAction extends _Action {

    private static final String VIEW = "/inventory.jsp";
    
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }
}
