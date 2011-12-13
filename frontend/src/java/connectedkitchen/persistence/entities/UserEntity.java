package connectedkitchen.persistence.entities;

import java.util.Set;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class UserEntity {
    
    private Set<FavoriteEntity> favorites;
    private Set<ItemEntity> items;
    private Set<RecipeHistory> recipeHistory;
    private Set<InventoryEntity> inventory;
    private String emailAddress;
    private String password;
    private boolean admin;
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private String postalCode;
    
    public UserEntity(){}
    
    public UserEntity(UserEntity userEntity){
        this.emailAddress = userEntity.getEmailAddress();
        this.password = userEntity.getPassword();
        this.admin = userEntity.isAdmin();
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
        this.address = userEntity.getAddress();
        this.state = userEntity.getState();
        this.postalCode = userEntity.getPostalCode();
    }
    
    public UserEntity(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public UserEntity(String emailAddress, String password, boolean admin, String firstName, String lastName, String address, String state, String postalCode) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.admin = admin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<FavoriteEntity> getFavorites() {
        return favorites;
    }

    public void setFavorites(Set<FavoriteEntity> favorites) {
        this.favorites = favorites;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<InventoryEntity> getInventory() {
        return inventory;
    }

    public void setInventory(Set<InventoryEntity> inventory) {
        this.inventory = inventory;
    }

    public Set<ItemEntity> getItems() {
        return items;
    }

    public void setItems(Set<ItemEntity> items) {
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
