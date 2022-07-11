
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        int amount = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                average = (double) sum / amount;
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                amount = amount + 1;
                sum = sum + num;
                continue;
            }
        }
    }
}
