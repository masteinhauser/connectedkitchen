package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class RecipeBaseAction extends _Action {

    private static final String VIEW = "/recipe.jsp";
    
    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution(VIEW);
    }
}
