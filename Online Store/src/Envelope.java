/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Envelope extends Package {
    String name;
    
    public Envelope(int w,int h, String n){
        super(w,h);
     
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public boolean isSuitable(int size1, int size2){
        if (((size1>this.width) && (size2>this.height)) || ((size1>this.height) && (size2>this.width))){
            return true;
        }
        else return false;
            
        }
        
    
}
