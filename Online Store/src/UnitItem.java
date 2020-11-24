/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class UnitItem {
    double unitPrice;
    int quantity;
    int quantityRemaining;
    Item item;
    
    public UnitItem(String n, String t,double s, double c, double uprice, int q){
       item.name = n;
       item.type = t;
       item.size = s;
       item.cost = c;
       this.unitPrice = uprice;
       this.quantity = q;
     
    }
    
    public double getPrice(){
        double price = this.unitPrice * this.quantity;
        return price;
    }
    
    public double calculateProfit(){
        double profit = getPrice() - item.cost;
        return profit;
    }
    
    public double sell(int q){
        this.quantityRemaining = this.quantityRemaining - q;
        this.quantity = q;
        return getPrice();
        
    }
    
    
}
