/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public interface Taxable{
    static double IVA = 0.21; // i put an static value, is the iva from spain
    
    
    public double getPrice();
    public double getPriceOnlyTax();
    public double getPricePlusTax();
    public double sumTotalTax(Taxable t);
    
}
