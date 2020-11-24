

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Package {
    int width;
    int height;
    
    public Package(int w,int h){
        this.width = w;
        this.height = h;
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
}
