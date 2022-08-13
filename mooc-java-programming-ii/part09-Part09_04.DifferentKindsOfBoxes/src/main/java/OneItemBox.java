
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
public class OneItemBox extends Box {
    
     private ArrayList<Item> itemInOneItemBox;
    
    private int capacity;
    
    public OneItemBox() {
        this.capacity = 1;
        this.itemInOneItemBox = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (itemInOneItemBox.size() + 1 == capacity ) {
            itemInOneItemBox.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (itemInOneItemBox.contains(item)) {
            return true;
        }
        return false;
    }
}
