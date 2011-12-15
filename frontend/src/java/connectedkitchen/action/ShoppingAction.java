package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/shopping.action")
@LoginRequired(type={LoginType.USER, LoginType.ADMIN})
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
        content = "This is where we list all of their needed items!";
        return new ForwardResolution(LIST);
    }
    
    public Resolution add(){
        action = "Add";
        content = "This is where they can add to their shopping list!";
        return new ForwardResolution(FORM);
    }
    
    public Resolution edit(){
        action = "Edit";
        content = "This is when we pull data from the database and they can edit the list! WOOOO!!!";
        return new ForwardResolution(FORM);
    }
    
    public String getAction(){
        return action;
    }
    
    public String getContent(){
        return content;
    }
}
