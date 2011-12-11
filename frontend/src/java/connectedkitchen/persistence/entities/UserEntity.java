package connectedkitchen.persistence.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.OneToMany;

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
    @Column(name = "favorite_id")
    private Set<Favorite> favorites;
    
    @OneToMany(mappedBy="user")
    @Column(name = "item_id")
    private Set<Item> items;
    
    @OneToMany(mappedBy="user")
    @Column(name = "recipe_history_id")
    private Set<RecipeHistory> recipeHistory;
    
    @OneToMany(mappedBy="user")
    @Column(name = "user_id")
    private Set<Inventory> inventory;
    
    @Column(name = "admin")
    private boolean admin;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "postal_code")
    private String postalCode;
    
    public User(){}
    
    public User(Integer id, boolean admin){
        this.id = id;
        this.admin = admin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Set<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<Favorite> favorites) {
        this.favorites = favorites;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(Set<Inventory> inventory) {
        this.inventory = inventory;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Set<RecipeHistory> getRecipeHistory() {
        return recipeHistory;
    }

    public void setRecipeHistory(Set<RecipeHistory> recipeHistory) {
        this.recipeHistory = recipeHistory;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
