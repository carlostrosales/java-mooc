
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        int sum = 0;
        int posAmount = 0;
        int negAmount = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                if (posAmount == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                average = (double) sum / posAmount;
                System.out.println(average);
                break;
            } else if (num > 0) {
                sum = sum + num;
                posAmount = posAmount + 1;
                continue;
            } else {
                negAmount = negAmount + 1;
                continue;
            }
        }
    }
}
