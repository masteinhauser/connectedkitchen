package connectedkitchen.persistence.entities;

import javax.persistence.ManyToOne;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class RecipeHistory extends BaseEntity {
    @ManyToOne
    private Recipe recipe;
    
    @ManyToOne
    private UserEntity user;
}
