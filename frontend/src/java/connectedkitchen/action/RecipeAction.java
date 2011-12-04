package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@UrlBinding("/recipe.action")
public class RecipeAction extends _Action {
    private static final String VIEW = "/recipe.jsp";
    
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
