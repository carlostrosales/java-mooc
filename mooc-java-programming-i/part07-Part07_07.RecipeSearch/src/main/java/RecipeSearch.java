
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.List;

public class RecipeSearch {

    public static void main(String[] args) {

        ArrayList<String> recipes = new ArrayList<>(); //ALL recipes in recipe.txt
        ArrayList<Recipe> recipe = new ArrayList<>(); //Recipes split & grouped in objects
        ArrayList<Integer> indices = new ArrayList<>(); //cooking time in all recipes list
        List<String> ingr; //ingredients seperated by recipe

        //create recipes - all lines together
        System.out.println("File to read:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                recipes.add(row);
            }
        } catch (Exception e) {
            System.out.println("An error occured!");
        }
        
        
        //Find cooking times (integers) in file
        for (String r: recipes) {
            if(isInteger(r)) {
                indices.add(recipes.indexOf(r));
            }
        }
        
        //Split and group recipes
        for (int i = 0; i < indices.size() - 1; i++) {
            int time = Integer.valueOf(recipes.get(indices.get(i)));
            String name = recipes.get(indices.get(i) - 1);
            
            recipe.add(new Recipe(name, time, recipes.subList(indices.get(i) + 1, indices.get(i + 1) - 1)));
        }
        
        int j = indices.size() - 1;
        int time = Integer.valueOf(recipes.get(indices.get(j)));
        String name = recipes.get(indices.get(j) - 1);
        
       recipe.add(new Recipe(name, time, recipes.subList(indices.get(j) + 1, recipes.size())));
        
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
 
        
        while(true) {
            System.out.println("Enter command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipe) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipe) {
                    if (r.getName().contains(search)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scan.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r: recipe) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
            
            
            if(command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipe r: recipe) {
                    if (r.getIngredient().contains(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println("");
            }
        }
    }
    
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
   
}
