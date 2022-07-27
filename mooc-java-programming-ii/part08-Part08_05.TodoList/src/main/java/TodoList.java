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

    public TodoList() {
        this.list = new ArrayList<String>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        
        if (list.isEmpty()) {
            System.out.println("");
        }
        
        int count = 1;
        for (String task: list) {
            System.out.println(count + ": " + task);
            count++;
        }
    }

    public void remove(int number) {
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (count == number) {
                this.list.remove(i);
            }
            count++;
        }
    }
}
