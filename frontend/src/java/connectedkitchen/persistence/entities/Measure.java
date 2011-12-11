package connectedkitchen.persistence.entities;

import java.math.BigInteger;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class Measure extends BaseEntity {
    
    @OneToMany(mappedBy="measure")
    @Column(name = "recipe_item_id")
    private Set<RecipeItem> recipeItems;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "milliliters")
    private BigInteger milliliters;
    
    @Column(name = "ounces")
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
