
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
public class Buyer extends User {
    String accountNumber;
    LinkedList<Item> boughtItems;
    double deposit;
    
    public Buyer(String n, String id, String p, String a, LinkedList<Item> buy){
        super(n,id,p);
        boughtItems = buy;
        this.accountNumber = a;
    }
    
    public void buy(Item u){
      boughtItems.add(u);
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
