import java.awt.Graphics;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Logo {
    int width,height;
    Turtle t;
    
    public Logo (int w,int h){
        this.width = w;
        this.height = h;
     
    }
    
    public int getWidth(){
        return this.width;
       
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void resetTurtle(){
        this.t.setCoor(0, 0);
    }
    
    public void execute(Program p, Graphics g){
        this.t.draw(g);
        
    }
}
