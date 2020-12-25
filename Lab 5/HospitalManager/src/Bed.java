/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Bed{
	private int bedID;
	private Room room;
	private Resident resident;
		
	public Bed( int id, Room r ){
		// Add code here
                this.bedID = id;
                this.room = r;
                
	}
	
	public void assignRoom( Room r ){
		// Add code here
                this.room = r;
	}
	
	public void assignResident( Resident r ){
		// Add code here
                this.resident = r;
	}
	
	public void release(){
		// Add code here
                this.resident = null;
                
	}
	
	public int getBedID(){
		// Add code here
                return this.bedID;
	}

	public boolean isAvailable(){
		// Add code here
                return this.resident == null;
	}	
	
	public String toString(){
		// Add code here
                String s = String.valueOf(bedID);
                return ("Bed " + s);
                
                
	}
}
