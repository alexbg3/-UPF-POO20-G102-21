
import java.awt.Graphics;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Turtle {
    int x,y;
    double dirx,diry;
    boolean pen;
     
    public Turtle (int x,int y, double dx, double dy, boolean p){
        this.x = x;
        this.y = y;
        this.dirx = dx;
        this.diry = dy;
        this.pen = p;
    }
    
    public int getx(){
        return this.x;
       
    }
    
    public int gety(){
        return this.y;
    }
    
    public double getDirX(){
        return this.dirx;
    }
    
    public double getDirY(){
        return this.diry;
    }
    
    
    public void setX(int x){
     this.x = x; 
     } 
     
    public void setY(int y){
     this.y = y; 
     } 
    
    public void setCoor(int x, int y){
     this.x = x;
     this.y = y;
     } 
    
    public void setDirX(double dx){
     this.dirx = dx; 
     } 
     
    public void setDirY(double dy){
     this.diry = dy; 
     } 
    
    public void setDirX(double dx,double dy){
     this.dirx = dx; 
     this.diry = dy; 
     } 
    
    public void forward(double distance, Graphics g){
        int x1 = this.x;
        int y1 = this.y;
        x += distance * Math.cos(Math.toRadians(dirx));
        y += distance * Math.sin(Math.toRadians(diry));
        x = Math.round(x);
        y = Math.round(y);
        
        g.drawLine(x1, y1, x, y);
    }
    public void turn(double a){
        dirx = (Math.cos(a)*dirx) - (Math.sin(a)*diry);
        diry = (Math.sin(a)*dirx) + (Math.cos(a)*diry);
    }
    
    public void setPen(boolean on){
        this.pen = on;
    }
    
    public boolean isPenOn(){
        return this.pen;
    }
    
    public void draw(Graphics g){
        int[] xc = null;
        int[] yc = null;
        
        xc [ 0 ] = (int ) ( x + 8 * diry ); 
        yc [ 0 ] = (int )( y - 8 * dirx );
        xc [ 1 ] = ( int ) ( x - 8 * diry ) ; 
        yc [ 1 ] = ( int ) ( y + 8 * dirx ) ;
        xc [ 2 ] = ( int ) ( x + 16 * dirx ) ; 
        yc [ 2 ] = ( int ) ( y + 16 * diry ) ;
        
        g.drawPolygon(xc, yc, 1000); ;
    }
 
    
}
