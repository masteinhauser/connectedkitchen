package connectedkitchen.persistence.entities;

import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class Inventory extends BaseEntity {
    
    @ManyToOne
    @Column(name = "item_id")
    private Item item;
    
    @ManyToOne
    @Column(name = "user_id")
    private User user;
    
    @Column(name = "quantity")
    private Double quantity;
    
    @Column(name = "expiration")
    private Date expiration;
    
    @Column(name = "cost")
    private BigInteger cost;

    public Inventory(Item item, User user, Double quantity, Date expiration, BigInteger cost) {
        this.item = item;
        this.user = user;
        this.quantity = quantity;
        this.expiration = expiration;
        this.cost = cost;
    }

    public BigInteger getCost() {
        return cost;
    }

    public void setCost(BigInteger cost) {
        this.cost = cost;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
