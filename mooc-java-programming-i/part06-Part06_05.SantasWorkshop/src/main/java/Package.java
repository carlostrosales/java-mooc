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
public class Package {

    private ArrayList<Gift> list;

    public Package() {
        this.list = new ArrayList<>();
    }

    public void addGift(Gift gift) {
         this.list.add(gift);
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Gift gifts: list) {
            sumOfWeights = sumOfWeights + gifts.getWeight();
        }
        return sumOfWeights;
    }
    
    
}
