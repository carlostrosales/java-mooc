
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = 0;
        int firstMax = 100;
        int secondNum = 0;
        int secondMax = 100;

        while (true) {

            System.out.println("First: " + firstNum + "/" + firstMax);
            System.out.println("Second: " + secondNum + "/" + secondMax);

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);


            if (command.equals("add")) {
                if (firstNum <= 100 && amount > 0) {
                    if (firstNum + amount > 100) {
                        firstNum = 100;
                    } else {
                        firstNum = firstNum + amount;
                    }
                }
            }

            if (command.equals("move")) {
                if (firstNum - amount < 0 && firstNum != 0 && amount > 0) {
                    if (secondNum + amount >= 100) {
                        secondNum = 100;
                        firstNum = 0;
                    } else {
                        secondNum = secondNum + firstNum;
                        firstNum = 0;
                    }
                } else if (firstNum != 0 && amount > 0) {
                    firstNum = firstNum - amount;
                    if (secondNum + amount >= 100) {
                        secondNum = 100;
                    } else {
                        secondNum = secondNum + amount;
                    }
                }
            }

            if (command.equals("remove")) {
                if (secondNum - amount < 0) {
                    secondNum = 0;
                } else {
                    secondNum = secondNum - amount;
                }

            }

        }
    }

}
