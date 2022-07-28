
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
        
    }
    
    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book values: hashmap.values()) {
            System.out.println(values);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book values: hashmap.values()) {
            if(values.getName().contains(text)) {
                System.out.println(values);
            }
        }
    }

}
