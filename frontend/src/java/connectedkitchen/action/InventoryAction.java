package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 *         Amanda Gilles <agilles220@gmail.com>
 */
@UrlBinding("/inventory.action")
@LoginRequired(type={LoginType.USER, LoginType.ADMIN})
public class InventoryAction extends _Action {
    private static final String VIEW = "/inventory.jsp";
    private static final String LIST = "/inventoryList.jsp";
    private static final String FORM = "/inventoryForm.jsp";
    
    private String action = "";
    private String content = "";
    
    @DefaultHandler
    public Resolution view() {
        content = "This page will include a list of inventory items that need"
                + " to be restocked.";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution list() {
        action = "List";
        content = "This will be where the user can browse through their current"
                + " inventory.";
        return new ForwardResolution(LIST);
    }
    
    public Resolution edit() {
        action = "Edit";
        content = "This is where the user can edit existing inventory items ("
                + "adjust quantities, last cost, description, etc).";
        return new ForwardResolution(FORM);
    }
    
    public Resolution add() {
        action = "Add";
        content = "This is where the user can enter new inventory items.";
        return new ForwardResolution(FORM);
    }
    
    public String getAction() {
        return action;
    }
    
    public String getContent() {
        return content;
    }
    
}
