
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> list = new ArrayList<>();
        
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String firstField = scanner.nextLine();
            if (firstField.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String secondField = scanner.nextLine();
            if (secondField.isEmpty()) {
                break;
            }
            
            
            Item item = new Item(firstField,secondField);
            
            if (!(list.contains(item))) {
                list.add(item);
            }
            
        }
        
        System.out.println("==Items==");
        for (Item thing: list) {
            System.out.println(thing.getId() + ": " + thing.getItem());
            }
    }
}
