
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BirdDatabase birdBase = new BirdDatabase();

        UserInterface ui = new UserInterface(scan, birdBase);
        ui.start();
    }
}
