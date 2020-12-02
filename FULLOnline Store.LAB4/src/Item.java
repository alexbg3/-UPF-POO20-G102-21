
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
public class Item implements Compare,Taxable{
    String name;
    String type;
    double size;
    double cost;
    Package pack;
    
    public Item(String n, String t, double s, double c) {
        this.name = n;
        this.type = t;
        this.size = s; 
        this.cost = c;
    }
    @Override
    public double getPrice(){
        return 0;
    }
    public double calculateProfit(){
        return 0;
    }
    @Override
    public double getPriceOnlyTax(){
        double price = getPrice();
        return Taxable.IVA*price;
    }
    @Override
    public double getPricePlusTax(){
        double price = getPrice();
        return price + getPriceOnlyTax();
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSize(){
        return this.size;
    }
    
    public String getType(){
        return this.type;
    }
    
    public double getCost(){
        return this.cost;
    }
    
    public Package getPack(){
        return this.pack;
    }
    
    public void setSize(double s){
        this.size = s;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setType(String t){
        this.type = t;
    }
    
    public void setCost(double c){
        this.cost = c;
    }
    
    public void assignBestPackage(LinkedList<Package> lp){
        
    }

    /**
     *
     * @return
     */

    @Override
        public int Compare(Object i) {
        double profit1 = this.calculateProfit();
        
        Item otherItem = (Item) i;
        double profit2 = otherItem.calculateProfit();
        return Double.valueOf(profit1).compareTo(Double.valueOf(profit2));
    }

    @Override
    public double sumTotalTax(Taxable t) {
        return t.getPriceOnlyTax() + this.getPriceOnlyTax();
    }

   

   
    
    
}

