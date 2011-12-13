package connectedkitchen.persistence.entities;

import java.util.Set;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class Recipe {
    
    private Set<FavoriteEntity> favorites;
    private Set<RecipeHistory> recipeHistory;
    
    private RecipeItem recipeItem;
    private String description;
    private String notes;
    
    public Recipe(){}

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

    public Set<FavoriteEntity> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<FavoriteEntity> favorites) {
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
