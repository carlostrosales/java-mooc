/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Game {
    private String team1;
    private String team2;
    private int team1score;
    private int team2score;
    
    public Game (String team1, String team2, int team1score, int team2score) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1score = team1score;
        this.team2score = team2score;
    }
    
    public String getTeam1 () {
        return this.team1;
    }
    
    public String getTeam2() {
        return this.team2;
    }
    
    public int getTeam1Score() {
        return this.team1score;
    }
    
    public int getTeam2Score() {
        return this.team2score;
    }
}
