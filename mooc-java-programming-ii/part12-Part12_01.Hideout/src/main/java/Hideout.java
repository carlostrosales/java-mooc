/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Hideout<T> {
    
    private T element;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }
    
    public T takeFromHideout() {
        if (this.element == null) {
            return null;
        }
        T takeOut = this.element;
        this.element = null;
        return takeOut;
    }
    
    public boolean isInHideout() {
        if (element != null) {
            return true;
        }
        return false;
    }
}
