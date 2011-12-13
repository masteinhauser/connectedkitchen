package connectedkitchen.persistence.entities;

import java.util.Set;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class RecipeItem {
    
    private Set<Recipe> recipes;
    private ItemEntity item;
    private Measure measure;
    private Double quantity;
    private String instruction;

    public RecipeItem(ItemEntity item, Measure measure, Double quantity, String instruction) {
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

    public ItemEntity getItem() {
        return item;
    }

    public void setItem(ItemEntity item) {
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
