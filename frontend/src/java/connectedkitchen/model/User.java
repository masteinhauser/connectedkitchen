package connectedkitchen.model;

import connectedkitchen.persistence.entities.UserEntity;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class User {
    private static User _instance = new User();  // Necessary to create a singleton.
    private Map<String, UserEntity> users = new HashMap<String, UserEntity>(){
        {
            UserEntity user = new UserEntity("msteinhauser@student.cvtc.edu", "cvtc");
            user.setId(new Long(0));
            user.setAdmin(true);
            user.setFirstName("Myles");
            user.setLastName("Steinhauser");
            put("msteinhauser@student.cvtc.edu", user);
            
            user = new UserEntity("agilles220@gmail.com", "cvtc");
            user.setId(new Long(1));
            user.setAdmin(true);
            user.setFirstName("Amanda");
            user.setLastName("Gilles");
            put("agilles220@gmail.com", user);
            
            user = new UserEntity("student@cvtc.edu", "cvtc");
            user.setId(new Long(2));
            user.setAdmin(false);
            user.setFirstName("Unknown");
            user.setLastName("Unknown");
            put("student@cvtc.edu", user);
        }
    };

    /**
     * Default constructor used primarily to gain access to methods and reserve memory.
     */
    private User(){}
    
    public static synchronized User getInstance() { 
        if (_instance==null) { 
            _instance = new User(); 
        } 
        return _instance; 
    } 
    
    /**
     * Create a new user with the given credentials.
     * @param emailAddress
     * @param password 
     */
    public void createUser(String emailAddress, String password) {
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
    public void createUser(String emailAddress, String password, boolean admin, String firstName, String lastName, String address, String state, String postalCode) {
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
    
    public void saveUser(UserEntity user){
        if(users.containsKey(user.getEmailAddress())){
            users.remove(user);
            users.put(user.getEmailAddress(), user);
        }
    }
}
