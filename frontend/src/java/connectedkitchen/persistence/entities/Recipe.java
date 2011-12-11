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
public class Recipe extends BaseEntity {
    
    @OneToMany(mappedBy="recipe")
    private Set<Favorite> favorites;
    
    @OneToMany(mappedBy="recipe")
    private Set<RecipeHistory> recipeHistory;
    
    @ManyToOne
    @Column(name = "recipe_item_id")
    private RecipeItem recipeItem;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "notes")
    private String notes;

    public Recipe(String description, String notes) {
        this.description = description;
        this.notes = notes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<Favorite> favorites) {
        this.favorites = favorites;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<RecipeHistory> getRecipeHistory() {
        return recipeHistory;
    }

    public void setRecipeHistory(Set<RecipeHistory> recipeHistory) {
        this.recipeHistory = recipeHistory;
    }

    public RecipeItem getRecipeItem() {
        return recipeItem;
    }

    public void setRecipeItem(RecipeItem recipeItem) {
        this.recipeItem = recipeItem;
    }
}
