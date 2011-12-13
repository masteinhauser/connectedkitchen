package connectedkitchen.persistence.entities;

import java.util.Set;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class ItemEntity {
    
    private Set<RecipeItem> recipeItem;
    private Set<InventoryEntity> inventory;
    private UserEntity user;
    private String description;
    private Double minQuantity;

    public ItemEntity(UserEntity user, String description, Double minQuantity) {
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

    public Set<InventoryEntity> getInventory() {
        return inventory;
    }

    public void setInventory(Set<InventoryEntity> inventory) {
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
