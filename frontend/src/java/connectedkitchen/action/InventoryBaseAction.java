package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class InventoryBaseAction extends _Action {

    private static final String VIEW = "/inventory.jsp";
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    
    @DefaultHandler
    public Resolution view() {
        test = "Test!";
        return new ForwardResolution(VIEW);
    }
}
