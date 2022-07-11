
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String words = scanner.nextLine();
            
            if (words.equals("")) {
                System.out.println("Age of the oldest: " + oldest);
                break;
            }
            
            String[] pieces = words.split(",");
            
           if (oldest < Integer.valueOf(pieces[1])) {
               oldest = Integer.valueOf(pieces[1]);
           }
            
        }

    }
}
