
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            list.add(num);
            
            if (num == 9999) {
                int smallest = Integer.MAX_VALUE;
                for (int i = 0; i < list.size(); i++) {
                    if (smallest > list.get(i)) {
                        smallest = list.get(i);
                    }
                }
                
                for (int i = 0; i < list.size(); i++) {
                    if (smallest == list.get(i)) {
                        System.out.println("Smallest number: " + smallest);
                        System.out.println("Found at index: " + i);
                    }
                }
                
                break;
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        

        
    }
}
