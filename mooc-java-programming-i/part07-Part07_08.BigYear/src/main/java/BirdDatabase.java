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
public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        this.birdList.add(new Bird(name, latinName));
    }

    public boolean observation(String name) {
        for (Bird bird : birdList) {
            if (bird.name().equals(name)) {
                bird.observations();
                return true;
            }
        }
        return false;
    }

    public String getOne(String name) {
        for (Bird bird : birdList) {
            if (bird.name().equals(name)) {
                return bird.toString();
            }
        }
        return null;
    }

    public String getAll() {
        String allBirds = "";
        for (Bird bird : birdList) {
            allBirds = allBirds + bird.toString();
        }
        return allBirds;
    }

}
