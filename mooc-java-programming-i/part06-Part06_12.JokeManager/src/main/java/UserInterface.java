/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class UserInterface {
    private JokeManager manager;
    private Scanner scan;
    
    public UserInterface (JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String entry = scan.nextLine();
            
            if (entry.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scan.nextLine();
                manager.addJoke(joke);
            } else if(entry.equals("2")) {
                System.out.println(manager.drawJoke());
            } else if(entry.equals("3")) {
                manager.printJokes();
            } else if(entry.equals("X")) {
                break;
            }
        }
    }
    
}
