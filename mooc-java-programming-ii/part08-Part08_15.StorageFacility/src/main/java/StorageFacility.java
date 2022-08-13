/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Carlos
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility() {
        this.map = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> completed = this.map.get(unit);
        completed.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        return this.map.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (this.map.containsKey(storageUnit)) {
            this.map.get(storageUnit).remove(item);
        }
        
        if (this.map.get(storageUnit).isEmpty()) {
            this.map.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storage = new ArrayList<String>(this.map.keySet());
        return storage;
    }
}
