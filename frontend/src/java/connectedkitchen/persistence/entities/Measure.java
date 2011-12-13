package connectedkitchen.persistence.entities;

import java.math.BigInteger;
import java.util.Set;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class Measure {
    
    private Set<RecipeItem> recipeItems;
    private String description;
    private BigInteger milliliters;
    private BigInteger ounces;

    public Measure(String description, BigInteger milliliters, BigInteger ounces) {
        this.description = description;
        this.milliliters = milliliters;
        this.ounces = ounces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(BigInteger milliliters) {
        this.milliliters = milliliters;
    }

    public BigInteger getOunces() {
        return ounces;
    }

    public void setOunces(BigInteger ounces) {
        this.ounces = ounces;
    }

    public Set<RecipeItem> getRecipeItems() {
        return recipeItems;
    }

    public void setRecipeItems(Set<RecipeItem> recipeItems) {
        this.recipeItems = recipeItems;
    }
}
