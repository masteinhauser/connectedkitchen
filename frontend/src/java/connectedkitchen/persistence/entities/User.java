package connectedkitchen.persistence.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.OneToMany;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
@Table(name = "user")
@SequenceGenerator(name="user_seq",sequenceName="user_id_seq")
public class User extends BaseEntity implements Serializable {
    
    @OneToMany(mappedBy="user")
    private Set<Favorite> favorites;
    
    @OneToMany(mappedBy="user")
    private Set<Item> items;
    
    @OneToMany(mappedBy="user")
    private Set<RecipeHistory> recipeHistory;
    
    @OneToMany(mappedBy="user")
    private Set<Inventory> inventory;
    
    private Integer id;
    private boolean admin;
    
    public User(){}
    
    public User(Integer id, boolean admin){
        this.id = id;
        this.admin = admin;
    }
    
    public Integer getUserId(){
        return id;
    }
    
    public boolean getAdmin(){
        return admin;
    }
}
