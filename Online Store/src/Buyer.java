
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
public class Buyer {
    String accountNumber;
    LinkedList<Item> boughtItems;
    User buyer;
    double deposit;
    
    public Buyer(String n, String id, String p, String a){
        buyer.name = n;
        buyer.identifier = id;
        buyer.password = p;
        this.accountNumber = a;
    }
    
    public void buy(Item item){
        boughtItems.add(item);
    }
    
    boolean pay(double price){
        if (price > this.deposit){
            return false;
        }
        else {
            this.deposit =- price;
            return true;
        }
        
    }
  
}
