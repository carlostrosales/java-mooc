
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int times = scanner.nextInt();
        Random number = new Random();
        
        for (int i = 0; i < times; i++) {
            int num = number.nextInt(11);
            System.out.println(num);
        }
    }

}
