/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.HashMap;
    import java.util.ArrayList;
    
/**
 *
 * @author Carlos
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> map;
    
    public VehicleRegistry() {
        this.map = new HashMap<LicensePlate,String>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(map.containsKey(licensePlate)) {
            return false;
        } else {
            map.put(licensePlate,owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        for(LicensePlate plate: map.keySet()) {
            if(plate.equals(licensePlate)) {
                return map.get(plate);
            }
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        for(LicensePlate plate: map.keySet()) {
            if(plate.equals(licensePlate)) {
                map.remove(plate);
                return true;
            }
        }
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate plate: map.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        
        for(LicensePlate plate: map.keySet()) {
            if(list.contains(map.get(plate))) {
                continue;
            } else {
                System.out.println(map.get(plate));
                list.add(map.get(plate));
            }
        }
    }
}
