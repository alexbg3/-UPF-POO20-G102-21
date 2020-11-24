
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
public class Administrator {
    User admin;
    //LinkedList user = MainOnlineStore.users;
    LinkedList<User> users;
    
    
    public Administrator(String n, String id, String p){
        admin.name = n;
        admin.identifier = id;
        admin.password = p;
        
    }
    
    public void expel(User u){
        users.remove(u);
    }
    
    public boolean manageAuction(AuctionItem a, String date){
        return (a.deadline.equals(date));
    }
    
    public void printStock(LinkedList<AuctionItem> items){
        System.out.println(items);
    }
}
