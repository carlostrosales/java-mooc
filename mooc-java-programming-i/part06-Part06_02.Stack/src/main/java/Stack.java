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
public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        if(this.stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void add(String value) {
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        int lastIndex = this.stack.size() - 1;
        String lastElement = this.stack.remove(lastIndex);
        return lastElement;
    }
}
