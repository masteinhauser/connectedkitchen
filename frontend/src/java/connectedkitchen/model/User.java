package connectedkitchen.model;

import connectedkitchen.persistence.entities.UserEntity;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public final class User extends UserEntity {
    private final Map<String, UserEntity> users = new HashMap<String, UserEntity>(){
        {
            UserEntity user = new UserEntity("msteinhauser@student.cvtc.edu", "cvtc");
            user.setId(new Long(0));
            user.setAdmin(true);
            put("msteinhauser@student.cvtc.edu", user);
            
            user = new UserEntity("agilles220@gmail.com", "cvtc");
            user.setId(new Long(1));
            user.setAdmin(true);
            put("agilles220@gmail.com", user);
            
            user = new UserEntity("student@cvtc.edu", "cvtc");
            user.setId(new Long(2));
            put("student@cvtc.edu", user);
        }
    };

    /**
     * Default constructor used primarily to gain access to methods and reserve memory.
     */
    public User(){}
    
    /**
     * Create a new user with the given credentials.
     * @param emailAddress
     * @param password 
     */
    public User(String emailAddress, String password) {
        UserEntity user = new UserEntity();
        
        user.setId(new Long(users.size()));
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
        
        users.put(emailAddress, user);
    }
    
    /**
     * Create a new user with the given credentials and information.
     * @param emailAddress
     * @param password
     * @param admin
     * @param firstName
     * @param lastName
     * @param address
     * @param state
     * @param postalCode 
     */
    public User(String emailAddress, String password, boolean admin, String firstName, String lastName, String address, String state, String postalCode) {
        UserEntity user = new UserEntity();
        
        user.setId(new Long(users.size()));
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
        user.setAdmin(admin);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAddress(address);
        user.setState(state);
        user.setPostalCode(postalCode);
        
        users.put(emailAddress, user);
    }
    
    /**
     * Get a user by their login credentials
     * @param emailAddress
     * @param password
     * @return An instance of the user or a nulled user.
     */
    public UserEntity getUser(String emailAddress, String password){
        if(users.containsKey(emailAddress)){
            UserEntity user = users.get(emailAddress);
            if(user.getPassword().equals(password)){
                return user;
            }
        }
        return new UserEntity();
    }
}
