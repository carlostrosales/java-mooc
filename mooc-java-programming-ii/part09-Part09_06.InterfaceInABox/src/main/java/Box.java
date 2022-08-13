/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + this.weight() <= capacity) {
            list.add(item);
        }
    }
    
    public double weight() {
        double weight = 0;
        
        for (Packable object: list) {
            weight = weight + object.weight();
        }
        
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + list.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
