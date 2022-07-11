
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String num = scanner.nextLine();
            
            if (num.equals("end")) {
                break;
            }
            
            int integer = Integer.valueOf(num);
            
            System.out.println(integer * integer * integer);
        }
    }
}
