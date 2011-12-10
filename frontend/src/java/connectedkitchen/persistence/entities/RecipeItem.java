package connectedkitchen.persistence.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Entity;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
@Entity
public class RecipeItem extends BaseEntity {
    
    @OneToMany(mappedBy="recipeItem")
    @Column(name = "recipe_id")
    private Set<Recipe> recipes;
    
    @ManyToOne
    @Column(name = "item_id")
    private Item item;
    
    @ManyToOne
    @Column(name = "measure_id")
    private Measure measure;
    
    @Column(name = "quantity")
    private Double quantity;
    
    @Column(name = "instruction")
    private String instruction;

    public RecipeItem(Item item, Measure measure, Double quantity, String instruction) {
        this.item = item;
        this.measure = measure;
        this.quantity = quantity;
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
