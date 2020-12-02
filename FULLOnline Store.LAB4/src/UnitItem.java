/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class UnitItem extends Item{
    double unitPrice;
    int quantity;
    int quantityRemaining;
    
    public UnitItem(String n, String t, double s, double c, double uprice, int q){
       super(n,t,s,c);
       this.unitPrice = uprice;
       this.quantity = q;
     
    }
    
    @Override
    public double getPrice(){
        double price = this.unitPrice * this.quantity;
        return price;
    }
    
    @Override
    public double calculateProfit(){
        double profit = getPrice() - this.cost;
        return profit;
    }
    
    public double sell(int q){
        this.quantityRemaining = this.quantityRemaining - q;
        this.quantity = q;
        return getPrice();
        
    }
    
    
}
