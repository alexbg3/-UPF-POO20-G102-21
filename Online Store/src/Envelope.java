/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Envelope {
    String name;
    Package pack;
    
    public Envelope(int w,int h, String n){
        pack.width = w;
        pack.height = h;
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public boolean isSuitable(int size1, int size2){
        if (((size1>pack.width) && (size2>pack.height)) || ((size1>pack.height) && (size2>pack.width))){
            return true;
        }
        else return false;
            
        }
        
    
}
