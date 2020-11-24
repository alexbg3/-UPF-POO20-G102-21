/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Box {
    int depth;
    Package pack;
    
    public Box(int w,int h, int d){
        pack.width = w;
        pack.height = h;
        this.depth = d;
    }
    
    public int getDepth(){
        return this.depth;
    }
    
    public void setDepth(int d){
        this.depth = d;
    }
    
    public boolean isSuitable(int size1,int size2,int size3){
        if (size1 > pack.width){
            if ((size2 > pack.height) && (size3 > this.depth) || (size3 > pack.height) && (size2 > this.depth)){
                return true;
            }
        }else if (size2 > pack.width){
            if ((size1 > pack.height) && (size3 > this.depth) || (size3 > pack.height) && (size1 > this.depth)){
                return true;
            }
        }else if (size3 > pack.width){
            if ((size2 > pack.height) && (size1 > this.depth) || (size1 > pack.height) && (size2 > this.depth)){
                return true;
            }
        }
        else {
            return false;
        }
         return false;
    } 
}
