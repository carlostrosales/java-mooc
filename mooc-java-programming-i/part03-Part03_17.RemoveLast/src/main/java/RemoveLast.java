
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("First");
        strings.add("Second");
        strings.add("third");
        
        removeLast(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        int last = strings.size() - 1;
        
        if (strings.size() > 0) {
            strings.remove(last);
        }
    }

}
