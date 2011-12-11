package connectedkitchen.persistence.entities;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class RecipeHistory extends BaseEntity {
    @ManyToOne
    @Column(name = "recipe_id")
    private Recipe recipe;
    
    @ManyToOne
    @Column(name = "user_id")
    private User user;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
