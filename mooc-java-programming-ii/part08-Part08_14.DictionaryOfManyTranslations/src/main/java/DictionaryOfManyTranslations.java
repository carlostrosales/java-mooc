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
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }

    public void add(String word, String translations) {
        this.map.putIfAbsent(word, new ArrayList<String>());
        
        ArrayList<String> completed = this.map.get(word);
        completed.add(translations);
    }
    
    public ArrayList<String> translate(String word) {
//        if(this.map.get(word).isEmpty()) {
//            return new ArrayList<String>();
//        }
//        
        ArrayList<String> emptyList = new ArrayList<>();
        return this.map.getOrDefault(word, emptyList);
    }
    
    public void remove(String word) {
        this.map.remove(word);
    }
}
