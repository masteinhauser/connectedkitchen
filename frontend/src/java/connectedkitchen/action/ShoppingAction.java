package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class ShoppingAction extends _Action {

    private static final String VIEW = "/shopping.jsp";
    private static final String LIST = "/shoppingList.jsp";
    private static final String FORM = "/shoppingForm.jsp";
    
    private String action = "";
    private String content = "";
    
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }
    
    public Resolution list(){
        action = "List";
        content = "This is where we list all of their recipes!";
        return new ForwardResolution(LIST);
    }
    
    public Resolution add(){
        action = "Add";
        content = "This is where they can add a NEW recipe!";
        return new ForwardResolution(FORM);
    }
    
    public Resolution edit(){
        action = "Edit";
        content = "This is when we pull data from the database and they can EDIT a recipe! WOOOO!!!";
        return new ForwardResolution(FORM);
    }
    
    public String getAction(){
        return action;
    }
    
    public String getContent(){
        return content;
    }
}