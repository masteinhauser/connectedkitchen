package connectedkitchen.persistence.entities;

import javax.persistence.ManyToOne;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class Inventory extends BaseEntity {
    
    @ManyToOne
    private Item item;
    
    @ManyToOne
    private UserEntity user;
}
