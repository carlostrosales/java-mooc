
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valueOne = Integer.valueOf(scanner.nextLine());
        int valueTwo = Integer.valueOf(scanner.nextLine());
        
        int sum = valueOne + valueTwo;
        
        System.out.println(Math.sqrt(sum));
    }
}
