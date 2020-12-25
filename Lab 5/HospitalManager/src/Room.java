/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */

import java.util.LinkedList;

public class Room{
	private LinkedList< Bed > beds;
	private int roomID;
	
	public Room( int roomID ){
		// Add code here
                this.roomID = roomID;
                beds = new LinkedList< Bed >();
                
	}
	
	public void addBed( int bedID ){
		// Add code here
                
                Bed b = new Bed(bedID, this);
                beds.add(b);
	}
	
	public Bed getBed( int idx ){
		// Add code here
                return beds.get(idx);
	}
	
	public Bed getAvailableBed(){
            
		// Add code here
                for (int i=0; i<beds.size(); i++){
                    Bed b = getBed(i);
                    if (b.isAvailable() == true){
                        i = beds.size();
                        return b;
                    }
                    
                }
                return null;
	}
	
	public boolean isAvailable(){
		// Add code here
                return this.getAvailableBed() != null;
	}
	
	public String listBeds(){
		// Add code here
                String s = "";
                for (int i=0; i<beds.size(); i++){
                    Bed b = getBed(i);
                    s += b.toString() + "\n";
                }
                return s;
	}

	public String toString(){ 
		// Add code here
                String s = String.valueOf(roomID);
                return ("Room " + s);
	}
}
