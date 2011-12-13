package connectedkitchen.persistence.entities;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class InventoryEntity {
    

    private ItemEntity item;
    private UserEntity user;
    private Double quantity;
    private Date expiration;
    private BigInteger cost;

    public InventoryEntity(ItemEntity item, UserEntity user, Double quantity, Date expiration, BigInteger cost) {
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

    public ItemEntity getItem() {
        return item;
    }

    public void setItem(ItemEntity item) {
        this.item = item;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
