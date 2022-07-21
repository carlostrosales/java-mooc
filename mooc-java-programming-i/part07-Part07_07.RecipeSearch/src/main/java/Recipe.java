/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Carlos
 */
public class Recipe {
    private String name;
    private int time;
    private List<String> ingredients;
    
    public Recipe(String name, int time, List<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public List<String> getIngredient() {
        return this.ingredients;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTime(int time) {
        this.time = time;
    }
    
    public void setIngredient (List<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public void printList() {
        for (String item: ingredients) {
            System.out.println(item);
        }
    }
    
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}
