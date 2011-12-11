package connectedkitchen.model;

import connectedkitchen.persistence.control.EntityController;
import connectedkitchen.persistence.entities.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class User {
    List<UserEntity> users = new ArrayList();
    Integer id = 0;

    public User(){}

    public User(Integer id){
        this.id = id;
    }

    public User getUser(Integer id){
        EntityManager em = EntityController.entityManager();

        users = em.createNamedQuery("User.getById").setParameter("id", id).getResultList();
        if(users.isEmpty()) {
            this.id = users.get(0).getId();
        }

        em.close();

        return new User();
    }
}
