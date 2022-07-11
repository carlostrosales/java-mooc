
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int val = 0;
        int sum = 0;
        int numOfNumbers = 0;
        double mean = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            val = Integer.valueOf(scanner.nextLine());
            
            if (val == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numOfNumbers);
                mean = sum / (double) numOfNumbers;
                System.out.println("Average: " + mean);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            
            if (val >= 0) {
                sum = sum + val;
                numOfNumbers++;
                if (val % 2 == 0) {
                    even++;
                } else if (val == 0){
                    even++;
                } else {
                    odd++;
                }
            }
        }

    }
}
