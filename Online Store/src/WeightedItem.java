/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class WeightedItem extends Item{
    double PricePerWeight;
    double weight;
    double weightRemaining;
    //Item item;
    
    public WeightedItem(String n, String t,double s, double c, double wprice, double w){
       super(n,t,s,c);
       this.PricePerWeight = wprice;
       this.weight = w;
    
    }
    
    public double getPrice(){
        double price = this.weight * this.PricePerWeight;
        return price;
    }
    
    public double calculateProfit(){
        double profit = getPrice() - this.cost;
        return profit;
    }
    
    public double sell(double w){
        this.weightRemaining =- w;
        return this.weightRemaining;
    }
  
}
