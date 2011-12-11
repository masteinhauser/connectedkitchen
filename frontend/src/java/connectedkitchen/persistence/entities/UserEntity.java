package connectedkitchen.persistence.entities;

import java.util.Set;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
@Table(name = "users")
@NamedQueries({
    @NamedQuery(name = "UserEntity.getById", query = "SELECT u FROM UserEntity u WHERE u.id = :id"),
    @NamedQuery(name = "UserEntity.updateById", query = "UPDATE UserEntity u SET u. WHERE u.id = :id")

})
public class UserEntity extends BaseEntity {
    
    @OneToMany(mappedBy="user")
    private Set<Favorite> favorites;
    
    @OneToMany(mappedBy="user")
    private Set<Item> items;
    
    @OneToMany(mappedBy="user")
    private Set<RecipeHistory> recipeHistory;
    
    @OneToMany(mappedBy="user")
    private Set<Inventory> inventory;
    
    public UserEntity(){}
}
