/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> list;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public boolean isOn() {
        for (Sensor s: list) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    public void setOn() {
        for (Sensor s: list) {
            s.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor s: list) {
            s.setOff();
        }
    }
    
    public int read() {
        if (!this.isOn() || this.list.isEmpty()) {
            throw new IllegalStateException("Wrong!");
        }
        
        int avg = this.list.stream()
                .map(s -> s.read())
                .reduce(0, (prev, curr) -> prev + curr) / this.list.size();
        
        this.readings.add(avg);
        return avg;
    }
    
    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
