/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Carlos
 */
public class Abbreviations {
    private HashMap<String, String> map;
    
    public Abbreviations() {
        this.map = new HashMap<String,String>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (!map.containsKey(abbreviation)) {
            map.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(map.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if (map.containsKey(abbreviation)) {
            return map.get(abbreviation);
        } else {
            return null;
        }
    }
}
