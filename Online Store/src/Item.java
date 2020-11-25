
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Item {
    String name;
    String type;
    double size;
    double cost;
    Package pack;
    
    public Item(String n, String t, double s, double c) {
        this.name = n;
        this.type = t;
        this.size = s; 
        this.cost = c;
    }
    public double getPrice(){
        return 0;
    }
    public double calculateProfit(){
        return 0;
    }
    public String getName(){
        return this.name;
    }
    
    public double getSize(){
        return this.size;
    }
    
    public String getType(){
        return this.type;
    }
    
    public double getCost(){
        return this.cost;
    }
    
    public Package getPack(){
        return this.pack;
    }
    
    public void setSize(double s){
        this.size = s;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setType(String t){
        this.type = t;
    }
    
    public void setCost(double c){
        this.cost = c;
    }
    
    public void assignBestPackage(LinkedList<Package> lp){
        
    }
    
    
    
}

