/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class AuctionItem extends Item {
    double currentPrice;
    Buyer bidder;
    String deadline;
    static double fee = 5;
    static double percentage = 1.05;
    
    public AuctionItem(String n, String t,double s, double c,double startingPrice,String d){
       super(n,t,s,c);
       this.currentPrice = startingPrice;
       this.deadline = d;
       
    }
    
    public double getPrice(){
        double price = fee + this.currentPrice * percentage;
        return price;
        
    }
    
    public double calculateProfit(){
        double profit = getPrice() - this.cost;
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
