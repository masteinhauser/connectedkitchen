package connectedkitchen.persistence.entities;

import java.util.Set;
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
    private RecipeItem recipeItem;
}
