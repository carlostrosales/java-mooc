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

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        read();
    }

    public void read() {
        System.out.println("Enter points totals, -1 stops: ");
        while (true) {
            String input = scanner.nextLine();
            int numInput = Integer.valueOf(input);

            if (numInput == -1) {
                break;
            }
               
            if(numInput < 0 || numInput > 100) {
                continue;
            }
            
            this.register.addGradeToList(numInput);
        }

        System.out.println("Point average (all): " + this.register.pointAverage());
        System.out.println("Point average (passing): " + this.register.pointPassingAverage());
        System.out.println("Pass percentage: " + this.register.passPercentage());
        System.out.println("Grade Distribution: ");
        printGradeDistribution();
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
           int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }
    
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
