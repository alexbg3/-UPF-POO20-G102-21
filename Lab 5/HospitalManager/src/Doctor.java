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

public class Doctor extends Person		// Add code here
{
	private LinkedList< String > specialities;
	private LinkedList< Visit > visits;

	public Doctor( int id, String name ){
		// Add code here
                super(id,name);
                specialities = new LinkedList< String >();
                visits = new LinkedList< Visit >();
	}
	
	public void addSpeciality( String s ){
		// Add code here
                specialities.add(s);
	}
	
	public void addVisit( Visit v ){
		// Add code here
                visits.add(v);
	}
	
	public void listSpecialities(){
		// Add code here
                
                System.out.println(this.toString() + "has specialities: ");
                for (int i=0; i<specialities.size(); i++){
                    String s = String.valueOf(specialities.get(i));
                    System.out.println(s);
                }
                
	}
	
	public void listVisits(){
		// Add code here
                System.out.println(this.toString() + "has the following visits: ");
                for (int i=0; i<visits.size(); i++){
                    String s = String.valueOf(visits.get(i));
                    System.out.println(s);
                }
	}
	
	public String toString(){ 
		// Add code here
                String per = super.toString();
                return ("Doctor " + per);
	}
}
