
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int val = Integer.valueOf(scanner.nextLine());
        
        int i = 1;
        int fac = 1;
        
        while (i <= val) {
            fac = fac * i;
            i++;
        }
        
        System.out.println("Factorial: " + fac);
    }
}
