/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class AuctionItem {
    double currentPrice;
    Buyer bidder;
    String deadline;
    Item item;
    
    public AuctionItem(String n, String t,double s, double c,double startingPrice,String d){
       item.name = n;
       item.type = t;
       item.size = s;
       item.cost = c;
       this.currentPrice = startingPrice;
       this.deadline = d;
       
    }
    
    public double getPrice(){
        double price = 5 + this.currentPrice * 1.05;
        return price;
        
    }
    
    public double calculateProfit(){
        double profit = getPrice() - item.cost;
        return profit;
    }
    
    public void makeBid(Buyer b, double p){
        this.currentPrice = p;
        this.bidder = b;
    }
    
    public boolean frozen(String d){
        return (this.deadline.equals(d));
    }
    
    public Buyer getBuyer(){
        return this.bidder;
    }
    
    public String getDeadline(){
        return this.deadline;
    }
    
    
    
    
}
