
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Game> list = new ArrayList<>();
        
        System.out.println("File: ");
        String name = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pieces = line.split(",");
                String team1 = pieces[0];
                String team2 = pieces[1];
                int team1score = Integer.valueOf(pieces[2]);
                int team2score = Integer.valueOf(pieces[3]);
                
                list.add(new Game(team1, team2, team1score, team2score));               
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        for (Game games: list) {
            if (games.getTeam1().equals(team) || games.getTeam2().equals(team)) {
                count++;
                if(games.getTeam1().equals(team)) {
                    if (games.getTeam1Score() > games.getTeam2Score()) {
                        wins++;
                    }
                    else {
                        losses++;
                    }
                }
                if(games.getTeam2().equals(team)) {
                    if (games.getTeam2Score() > games.getTeam1Score()) {
                        wins++;
                    }
                    else {
                        losses++;
                    }
                }
            }
            
            
            
        }
        
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
        
}
