/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId () {
        return this.id;
    }
    
    public String getItem () {
        return this.name;
    }
    
    public boolean equals(Object name) {
        if (this == name) {
            return true;
        }
        
        if (!(name instanceof Item)) {
            return false;
        }
        
        Item piece = (Item) name;
        
        if (this.id.equals(piece.id)) {
            return true;
        }
        
        return false;
    }
}
