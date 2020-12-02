


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
;

public class Sale implements Compare{
    String date;
    Item item;
    Buyer buyer;
    public Sale(Buyer b, Item i, String d){
        this.date = d;
        this.item = i;
        this.buyer = b;
                
    }
    public String getDate(){
        return this.date;
    }
    public Item getItem(){
        return this.item;
    }
    public Buyer getBuyer(){
        return this.buyer;
    }
    public void setDate(String d){
        this.date = d;
    }
    public void setItem(Item i){
        this.item = i;
    }
    public void setBuyer(Buyer b){
     this.buyer = b;   
    }    
    @Override
    public int Compare(Object i) {
        Sale otherSale = (Sale)i;
        return this.date.compareTo(otherSale.date);
    }
    
 
    
}
