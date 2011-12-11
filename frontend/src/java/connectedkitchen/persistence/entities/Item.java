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
public class Item extends BaseEntity {
    
    @OneToMany(mappedBy="item")
    private Set<RecipeItem> recipeItem;
    
    @OneToMany(mappedBy="item")
    private Set<Inventory> inventory;
    
    @ManyToOne
    private UserEntity user;
}
