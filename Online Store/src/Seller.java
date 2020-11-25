
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
public class Seller extends User {
    String accountNumber;
    LinkedList<Item> soldItems;
    LinkedList<Item> availableItems;
    double deposit;
    
    public Seller(String n, String id, String p,String a,LinkedList<Item> sold, LinkedList<Item> available){
        super(n,id,p);
        this.accountNumber = a;
        soldItems = sold;
        availableItems = available;
    }
    
    public void sell(Item item){
        soldItems.add(item);
        availableItems.remove(item);
    }
    
    public boolean addAvailableItem(Item item){
        availableItems.add(item);
        return true;
    }
    
    boolean deposit(double price){
        deposit =+ price;
        return true;
    }
}

