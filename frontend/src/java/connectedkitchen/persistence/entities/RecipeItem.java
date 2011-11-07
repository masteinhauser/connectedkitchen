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
public class RecipeItem extends BaseEntity {
    
    @OneToMany(mappedBy="recipeItem")
    private Set<Recipe> recipes;
    
    @ManyToOne
    private Item item;
    
    @ManyToOne
    private Measure measure;
}
