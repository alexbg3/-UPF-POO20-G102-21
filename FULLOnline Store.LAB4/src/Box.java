/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Box extends Package {
    int depth;
    
    public Box(int w,int h,double c, int d){
        super(w,h,c);
        this.depth = d;
    }
    
    public int getDepth(){
        return this.depth;
    }
    
    public void setDepth(int d){
        this.depth = d;
    }
    
    public boolean isSuitable(int size1,int size2,int size3){
        if (size1 > this.width){
            if ((size2 > this.height) && (size3 > this.depth) || (size3 > this.height) && (size2 > this.depth)){
                return true;
            }
        }else if (size2 > this.width){
            if ((size1 > this.height) && (size3 > this.depth) || (size3 > this.height) && (size1 > this.depth)){
                return true;
            }
        }else if (size3 > this.width){
            if ((size2 > this.height) && (size1 > this.depth) || (size1 > this.height) && (size2 > this.depth)){
                return true;
            }
        }
        else {
            return false;
        }
         return false;
    } 
  
}
