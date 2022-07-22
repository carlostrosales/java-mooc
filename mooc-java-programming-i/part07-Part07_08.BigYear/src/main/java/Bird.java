/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String name() {
        return this.name;
    }

    public void observations() {
        this.observations++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }

}
