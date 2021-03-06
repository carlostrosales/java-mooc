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
public class Room {
    
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person smallest = this.list.get(0);
        
        for (Person persons: list) {
            if (smallest.getHeight() > persons.getHeight()) {
                smallest = persons;
            }
        }
        return smallest;
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        
        list.remove(this.shortest());
        
        return shortest;
    }
}
