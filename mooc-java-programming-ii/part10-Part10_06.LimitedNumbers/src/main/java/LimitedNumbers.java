
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            
            int input = scanner.nextInt();
            
            if(input < 0) {
                list.stream()
                    .filter(values -> values >= 1 && values <= 5)
                    .forEach(values -> System.out.println(values));
                              
                break;
            }
            
            list.add(input);
            
        }

    }
}
