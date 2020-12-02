


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Package implements Taxable{
    int width;
    int height;
    double cost;
    
    public Package(int w,int h, double c){
        this.width = w;
        this.height = h;
        this.cost = c;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(double c){
        this.cost = c;
}
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
        
    }
    public void setWidth(int w){
        this.width = w;
    }
    
    public void setHeight(int h){
        this.height = h;
    }

         @Override
    public double getPrice() {
        return this.cost;
    }

    @Override
    public double getPriceOnlyTax() {
         double price = getPrice();
        return Taxable.IVA*price;
    }

    @Override
    public double getPricePlusTax() {
        double price = getPrice();
        return price + getPriceOnlyTax();
    }


    @Override
    public double sumTotalTax(Taxable t) {
        return t.getPriceOnlyTax() + this.getPriceOnlyTax();
    }
}
    


    