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
    private TodoList instance;
    private Scanner scan;
    
    
    public UserInterface(TodoList instance, Scanner scan) {
        this.instance = instance;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String add = scan.nextLine();
                this.instance.add(add);
            }
            
            if (command.equals("list")) {
                this.instance.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int remove = Integer.valueOf(scan.nextLine());
                this.instance.remove(remove);
            }
            
        }
    }
}
