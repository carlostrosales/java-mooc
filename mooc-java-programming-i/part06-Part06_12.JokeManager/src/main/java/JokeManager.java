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
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        //Add funtionality to draw random joke
        int index = (int) (Math.random() * jokes.size());
        String rand = jokes.get(index);
        return rand;
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
