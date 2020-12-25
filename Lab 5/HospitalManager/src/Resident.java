
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Resident extends Patient // Add code here
{
	private Room room;
	private Bed bed;

	public Resident ( int id, String name, int age ){
		// Add code here
                super(id,name,age);
                room = null;
                
	}
	
	public void assignRoom( Room r ){
		// Add code here
                this.room = r;
	}
	
	public void assignBed( Bed b ){
		// Add code here
                this.bed = b;
	}
	
	public Doctor getDoctor(){
		// Add code here
                
                if (super.visits.size() != 0){
                    return super.visits.get(0).doctor;
                }else{
                    return null;
                }
                
                
                    
	}
	
	public String toString(){
		// Add code here
                String pat = super.toString();
                
                
                
                String s = "";
                if (this.room == null){
                    s += ("Resident " + pat + " and has no room neither bed ");
                }else {
                    String room = this.room.toString();
                    String bed = this.bed.toString();
                    s += ("Resident " + pat + " is assigned to " + room + " " + bed);
                }
                if (getDoctor() == null){
                    s += (" and has no doctor");
                   
                } else {
                    String doc = getDoctor().toString();
                    s += (" and " + doc);
                }
                
                return s;
                
                
	}
}

