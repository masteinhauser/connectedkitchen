package connectedkitchen.persistence.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class Item extends BaseEntity {
    
    @OneToMany(mappedBy="item")
    @Column(name = "recipe_id")
    private Set<RecipeItem> recipeItem;
    
    @OneToMany(mappedBy="item")
    @Column(name = "inventory_id")
    private Set<Inventory> inventory;
    
    @ManyToOne
    @Column(name = "user_id")
    private User user;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "min_quantity")
    private Double minQuantity;

    public Item(User user, String description, Double minQuantity) {
        this.user = user;
        this.description = description;
        this.minQuantity = minQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(Set<Inventory> inventory) {
        this.inventory = inventory;
    }

    public Double getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(Double minQuantity) {
        this.minQuantity = minQuantity;
    }

    public Set<RecipeItem> getRecipeItem() {
        return recipeItem;
    }

    public void setRecipeItem(Set<RecipeItem> recipeItem) {
        this.recipeItem = recipeItem;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
