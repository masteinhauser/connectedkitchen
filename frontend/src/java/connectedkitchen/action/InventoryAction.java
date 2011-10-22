package connectedkitchen.action;

import java.util.Date;
import java.util.Random;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class InventoryAction implements ActionBean {

    private ActionBeanContext ctx;
    private static final String VIEW = "/inventory.jsp";

    public ActionBeanContext getContext() {
        return ctx;
    }

    public void setContext(ActionBeanContext ctx) {
        this.ctx = ctx;
    }
    
    @DefaultHandler
    public Resolution currentDate() {
        return new ForwardResolution(VIEW);
    }
}
