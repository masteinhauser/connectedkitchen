package connectedkitchen.model;

import connectedkitchen.persistence.entities.UserEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class User {
    UserEntity user = new UserEntity();
    
    public User(){}
    
    public User(Integer id){
        user.setId(id);
    }
    
    public void createUser(){
    
    }
}
