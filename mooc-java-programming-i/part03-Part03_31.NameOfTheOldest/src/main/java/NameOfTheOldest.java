
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String who = "";
        while (true) {
            
            String name = scanner.nextLine();
            
            if(name.equals("")) {
                System.out.println("Name of the oldest: " + who);
                break;
            }
            
            String[] pieces = name.split(",");
            
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
                who = pieces[0];
            }
        }

    }
}
