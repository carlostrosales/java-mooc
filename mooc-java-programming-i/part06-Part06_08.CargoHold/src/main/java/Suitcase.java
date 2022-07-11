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
public class Suitcase {

    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int weight) {
        this.list = new ArrayList<>();
        this.maxWeight = weight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() <= maxWeight) {
            this.list.add(item);
        }

    }

    public void printItems() {
        for (Item items : list) {
            System.out.println(items);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item items : list) {
            total = total + items.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.list.size() == 0) {
            return null;
        }

        Item max = list.get(0);
        for (Item items : list) {
            if (items.getWeight() > max.getWeight()) {
                max = items;
            }
        }
        return max;
    }

    public String toString() {
        if (list.size() == 0) {
            return "no items (0 kg)";
        } else if (list.size() == 1) {
            return this.list.size() + " item " + this.totalWeight() + " kg)";
        } else {
            return this.list.size() + " items " + this.totalWeight() + " kg)";
        }
    }

}
