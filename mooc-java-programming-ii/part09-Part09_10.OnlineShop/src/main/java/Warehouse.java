
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Warehouse {
    
    private Map<String, Integer> price;
    private Map<String, Integer> quantity;
    
    public Warehouse() {
        this.price = new HashMap<String, Integer>();
        this.quantity = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.quantity.put(product, stock);
    }
    
    public int price(String product) {
        return price.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return quantity.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stock(product) > 0) {
            quantity.put(product, quantity.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> newSet = new HashSet<>();
        
        for (String items: quantity.keySet()) {
            newSet.add(items);
        }
        
        return newSet;
        
    }
    
    
}
