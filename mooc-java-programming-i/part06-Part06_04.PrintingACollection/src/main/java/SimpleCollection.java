
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        int size = this.elements.size();
        
        String t = "";
        
        for (String things : elements) {
            if (elements.indexOf(things) == size - 1) {
                t = t + things;
            } else {
                t = t + things + "\n";
            }
        }
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if (size == 1) {
            return "The collection " + this.name + " has " + size + " element:" + "\n" + t;
        } else {
            return "The collection " + this.name + " has " + size + " elements:" + "\n" + t;
        }
    }

}
