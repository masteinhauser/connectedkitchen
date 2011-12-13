package connectedkitchen.model;

import connectedkitchen.persistence.control.EntityController;
import connectedkitchen.persistence.entities.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class User {
    private UserEntity user = new UserEntity();

    public User(){}
    
    public User(String emailAddress, String password) {
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
    }
    
    public User(String emailAddress, String password, boolean admin, String firstName, String lastName, String address, String state, String postalCode) {
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
        user.setAdmin(admin);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);
        user.setState(state);
        user.setPostalCode(postalCode);
    }

    /**
     * Get a user by their user ID
     * @param emailAddress
     * @param password
     * @return The user, if no user found an exception is thrown.
     */
    public UserEntity getUser(Integer id){

        return user;
    }
    
    /**
     * Get a user by their login credentials
     * @param emailAddress
     * @param password
     * @return The user, if no user found an exception is thrown.
     */
    public UserEntity getUser(String emailAddress, String password){

        return user;
    }
   
    public void createUser() {        
        
    }
    
    public void saveUser() {        
        
    }
}
