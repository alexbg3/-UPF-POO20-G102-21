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
import java.util.Date;

public class Administrative extends Person// Add code here
{

	private Hospital hospital;	
	
	public Administrative( int id, String name, Hospital hospital ){
		// Add code here
                super(id, name);
                this.hospital = hospital;
	}
	
	public void addVisit( Date d, String s, Doctor doc, Patient p ){
		// Add code here
                Visit v = new Visit(d,s,doc,p);
                hospital.addVisit(v);
                p.addVisit(v);
                
                
                
	}

	public boolean assignBed( Resident resident  ){
		// Add code here
                LinkedList<Room> rooms = hospital.getRooms();
                for (int i = 0; i<rooms.size(); i++){
                    Room r = rooms.get(i);
                    Bed b = r.getAvailableBed();
                    if (b != null){
                        resident.assignBed(b);
                        resident.assignRoom(r);
                        b.assignResident(resident);
                        i = rooms.size();
                        return true;
                    }
                }
                return false;
               
	}
	
	public String toString(){ 
		// Add code here
                String per = super.toString();
                return ("Administrative " + per);
 	}
}
