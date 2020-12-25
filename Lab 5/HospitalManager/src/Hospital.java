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
import java.util.Collections;

public class Hospital{
	private LinkedList< Administrative > admins;
	private LinkedList< Doctor > doctors;
	private LinkedList< Patient > patients;
	private LinkedList< Room > rooms;
	private LinkedList< Visit > visits;
	private String name;

	public Hospital( String name ){
		// Add code here
                this.name = name;
                rooms = new LinkedList<Room>();
                admins = new LinkedList< Administrative >();
                doctors = new LinkedList< Doctor >();
                patients = new LinkedList< Patient >();
                visits = new LinkedList< Visit >();
	}
	
	public void addAdmin( Administrative a ){	
		// Add code here
                this.admins.add(a);
	}

	public Administrative getAdmin( int idx ){
		// Add code here
                Administrative adm = admins.get(idx);
                return adm;
	}
	
	public void addDoctor( Doctor d ){
		// Add code here
                this.doctors.add(d);
	}

	public Doctor getDoctor( int idx ){
		// Add code here
                Doctor doc = doctors.get(idx);
                return doc;
	}
        

	public void addRoom( int id ){
		// Add code here
            Room r;
            r = new Room( id );
            this.rooms.add( r );
	}

	public Room getRoom( int idx ){
		// Add code here
                Room r = rooms.get(idx);
                return r;
	}	
	
	public LinkedList< Room > getRooms(){
		// Add code here
                return rooms;
                
	}
	
	public void addResident(  int id, String name, int age ){
		// Add code here
                Resident r = new Resident(id, name, age);
                this.patients.add(r);
                
                
	}
	
	public void addVisitor( int id, String name, int age ){
		// Add code here
                Visitor v = new Visitor(id,name,age);
                this.patients.add(v);
	}
	
	public void addVisit( Visit v ){
		// Add code here
                this.visits.add(v);
	}
	
	public Visit getVisit( int idx ){
		// Add code here
                Visit v = visits.get(idx);
                return v;
	}
	
	public Patient getPatient( int idx ){
		// Add code here
                Patient p = patients.get(idx);
                return p;
	}

	public void deletePatient( int idx ){
		// Add code here
                patients.remove(idx);
	}
	
	public void assignBeds( int adminIdx ){
		// Add code here
                
                for (int i=0; i<patients.size(); i++){
                    String type = String.valueOf(patients.get(i).getClass());
                    if (("class Resident".equals(type))){
                        Resident r = (Resident) patients.get(i);
                        boolean assign = this.admins.get(adminIdx).assignBed(r);
                        if (assign == true){
                            System.out.println(this.admins.get(adminIdx).toString()+ "has assigned bed to " + r.toString());
                        }else{
                            System.out.println(this.admins.get(adminIdx).toString()+ "has not found bed for" + r.toString());
                        }
                        
                    }
                        
                    
                    
                }
                   
                
	}

	public void sortPatients(){
		// Add code here
                Collections.sort(patients);
	}
	
	public String toString(){
		// Add code here
                String s = "";
                s += (this.name + "\nAdministratives: \n");
                for (int i = 0; i<admins.size(); i++){
                    String adm = admins.get(i).toString();
                    s += (adm + "\n");
                    
                }
                s += ("Doctors: \n");
                for (int i = 0; i<doctors.size(); i++){
                    String doc = doctors.get(i).toString();
                    s += (doc + "\n");
                    
                }
                s += ("Patients: \n");
                for (int i = 0; i<patients.size(); i++){
                    String type = String.valueOf(patients.get(i).getClass());
                    if (("class Resident".equals(type))){
                        Resident r = (Resident) patients.get(i);
                        s += (r.toString() + "\n");
                    }else{
                        Visitor v = (Visitor) patients.get(i);
                        s += (v.toString() + "\n");
                    }
                    
                }
                s += ("Rooms: \n");
                for (int i = 0; i<rooms.size(); i++){
                    Room r = rooms.get(i);
                    String room = r.toString();
                    s += (room + "\n");
                    
                    s += (r.listBeds() + "\n");
                    
                }
            return s;        
        }
                
                
	

}
