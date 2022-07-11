
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        System.out.println("Where from?");
        int to = Integer.valueOf(scanner.nextLine());
        int from = Integer.valueOf(scanner.nextLine());
        while(from <= to) {
            System.out.println(from);
            from++;
        }
    }
}
