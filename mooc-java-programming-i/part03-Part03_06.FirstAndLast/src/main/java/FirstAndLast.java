
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        int lastIndex = list.size() - 1;
        String last = list.get(lastIndex);
        String first = list.get(0);
        
        System.out.println(first);
        System.out.println(last);
        
    }
}
