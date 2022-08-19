/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class SaveableDictionary {
    
    private HashMap<String,String> map;
    private File file;
    
    public SaveableDictionary() {
        this.map = new HashMap<>();
    }
    
    public SaveableDictionary(String fileName) {
        this.map = new HashMap<>();
        this.file = new File(fileName);
    }
    
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file.getName()));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.map.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("File load error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file.getName());
            for (String s: this.map.keySet()) {
                String word = s;
                String translation = this.map.get(s);
                pw.println(word + ":" + translation);
            }
            pw.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public void add(String words, String translation) {
       this.map.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {
        for (String item: this.map.keySet()) {
            if (this.map.get(item).equals(word)) {
                return item;
            } else if (this.map.get(word) != null) {
                return this.map.get(word);
            }
        }
        
        return null;
    }
    
    public void delete(String word) {
        String itemToRemove = "";
        for (String item: this.map.keySet()) {
            if (this.map.get(item).equals(word)) {
                itemToRemove = item;
            } else if (this.map.get(word) != null) {
                itemToRemove = word;
            }
        }
        this.map.remove(itemToRemove);
    }
}
