/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/**
 *
 * @author Carlos
 */
public class ChangeHistory {
    
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        this.list = new ArrayList<>();
    }
    
    public void add(double status) {
        list.add(status);
    }
    
    public void clear() {
        list.clear();
    }
    
    public double maxValue() {
         if (list.isEmpty()) {
            return 0.0;
        }

        return Collections.max(list);
    }
    
    public double minValue() {
       if (list.isEmpty()) {
            return 0.0;
        }

        return  1.0 * Collections.min(list);
    }
    
    public double average() {
         int sum = 0;

        if (list.isEmpty()) {
            return sum;
        }

        for (double e : list) {
            sum += e;

        }

        return 1.0 * sum / list.size();
    }
    
    public String toString() {
        return list.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChangeHistory other = (ChangeHistory) obj;
        if (!Objects.equals(this.list, other.list)) {
            return false;
        }
        return true;
    }
    
}
