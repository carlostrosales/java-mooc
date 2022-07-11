
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = Integer.valueOf(scanner.nextLine());
        while (val <= 100) {
            System.out.println(val);
            val++;
        }
    }
}
