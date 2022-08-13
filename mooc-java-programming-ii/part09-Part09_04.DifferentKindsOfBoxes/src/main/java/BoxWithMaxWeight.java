
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> itemsInMaxBox;
    
    private int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }
    
    public void add(Item item) {
        
        if (item.getWeight() <= capacity) {
            itemsInMaxBox.add(item);
            capacity = capacity - item.getWeight();
        }
    }
    
    public boolean isInBox(Item item) {
        if (itemsInMaxBox.contains(item)) {
            return true;
        }
        return false;
    }
    
}
