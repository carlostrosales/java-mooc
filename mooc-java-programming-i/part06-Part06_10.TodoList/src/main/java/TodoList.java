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
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList () {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        int counter = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(counter + ": " + list.get(i));
            counter++; 
        }
    }
    
    public void remove (int number) {
        this.list.remove(number - 1);
    }
}
