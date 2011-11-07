package connectedkitchen.persistence.entities;

import java.util.Set;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class User extends BaseEntity {
    
    @OneToMany(mappedBy="user")
    private Set<Favorite> favorites;
    
    @OneToMany(mappedBy="user")
    private Set<Item> items;
    
    @OneToMany(mappedBy="user")
    private Set<RecipeHistory> recipeHistory;
    
    @OneToMany(mappedBy="user")
    private Set<Inventory> inventory;
    
}
