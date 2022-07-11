
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longest = "";
        double average = 0;
        int sum = 0;
        int num = 0;
        while (true) {
            
            String names = scanner.nextLine();
            
            if (names.equals("")) {
                average = (double) sum / num;
                System.out.println("Longest name: " + longest);
                System.out.println("Average of the birth years: " + average);
                break;
            }
            
            String[] pieces = names.split(",");
            String word = pieces[0];
            
            if (word.length() > longest.length()) {
                longest = word;
            }
            
            sum = sum + Integer.valueOf(pieces[1]);
            num++;
            
        }
    }
}
