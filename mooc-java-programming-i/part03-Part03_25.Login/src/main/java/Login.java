
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = "alex";
        String name2 = "emma";
        String password1 = "sunshine";
        String password2 = "haskell";

        String nameOne = scanner.nextLine();
        String passwordOne = scanner.nextLine();

        if ((nameOne.equals("alex") && passwordOne.equals("sunshine")) || (nameOne.equals("emma") && passwordOne.equals("haskell"))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
