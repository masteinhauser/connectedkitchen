package connectedkitchen.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 *
 * @author Amanda Gilles <agilles220@gmail.com>
 */
@UrlBinding("/recipe.action")
public class RecipeAction extends _Action {
    private static final String VIEW = "/recipe.jsp";
    private static final String SEARCH = "/recipeSearch.jsp";
    private static final String FORM = "/recipeForm.jsp";
    
    private String action = "";
    private String content = "";
    
    @DefaultHandler
    public Resolution view() {
        content = "This page should include a top favorites list of recipes, or"
                + " possibly a list of recipes that could be made with current"
                + " inventory.";
        return new ForwardResolution(VIEW);
    }
    
    public Resolution search() {
        action = "Search";
        content = "This is where they can get a list of recipes. For now they will"
                + " be manually entered, but once fully operational, they will"
                + " also be searchable through the internet.";
        return new ForwardResolution(SEARCH);
    }
    
    public Resolution add() {
        action = "Add";
        content = "This is where they will be able to manually new recipes.";
        return new ForwardResolution(FORM);
    }
    
    public Resolution edit() {
        action = "Edit";
        content = "This is where the list of recipes can be pulled from the"
                + " database or internet, then edited and saved.";
        return new ForwardResolution(FORM);
    }
    
    public String getAction() {
        return action;
    }
    
    public String getContent() {
        return content;
    }
    
}
