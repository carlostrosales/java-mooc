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

    private Scanner scan;
    private BirdDatabase birdBase;

    public UserInterface(Scanner scan, BirdDatabase birdBase) {
        this.scan = scan;
        this.birdBase = birdBase;
    }

    public void start() {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        while (true) {
            System.out.println("?");
            String input = scan.nextLine();

            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {
                add();
            } else if (input.equals("Observation")) {
                observation();
            } else if (input.equals("All")) {
                all();
            } else if (input.equals("One")) {
                one();
            } else {
                System.out.println("Unknown command!");
            }

        }
    }

    public void add() {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latin = scan.nextLine();

        birdBase.add(name, latin);
    }

    public void observation() {
        System.out.println("Bird?");
        String bird = scan.nextLine();
        Boolean question = birdBase.observation(bird);
        if (!question) {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        System.out.println(birdBase.getAll());
    }

    public void one() {
        System.out.println("Bird?");
        String input = scan.nextLine();
        String ans = birdBase.getOne(input);
        if (ans == null) {
            System.out.println(input + " is not a bird!");
        } else {
            System.out.println(ans);
        }
    }

}
