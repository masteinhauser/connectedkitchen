package connectedkitchen.persistence.entities;

import java.util.Set;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class Measure extends BaseEntity {
    
    @OneToMany(mappedBy="measure")
    private Set<RecipeItem> recipeItems;
    
}
