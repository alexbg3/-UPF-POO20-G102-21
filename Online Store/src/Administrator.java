
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
public class Administrator extends User {
    
    //LinkedList user = MainOnlineStore.users;
    LinkedList<User> listUser;
    
    
    public Administrator(String n, String id, String p, LinkedList<User> users){
        super(n,id,p);
        listUser = users;
       
        
    }
    
    public void expel(User u){
        listUser.remove(u);
    }
    
    public boolean manageAuction(AuctionItem a, String date){
        return (a.deadline.equals(date));
    }
    
    public void printStock(LinkedList<Item> items){
        System.out.println(items);
    }
}
