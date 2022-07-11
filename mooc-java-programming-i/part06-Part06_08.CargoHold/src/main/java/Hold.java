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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> cargo;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cargo = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalHold() <= maxWeight) {
            this.cargo.add(suitcase);
        }
    }
    
    public int totalHold () {
        int total = 0;
        for (Suitcase cases: cargo) {
            total = total + cases.totalWeight();
        }
        return total;
    }
    
    public String toString() {
        return this.cargo.size() + " suitcases " + "(" + this.totalHold() + " kg)"; 
    } 
    
    public void printItems() {
        for(Suitcase cases: cargo) {
            cases.printItems();
        }
    }
}
