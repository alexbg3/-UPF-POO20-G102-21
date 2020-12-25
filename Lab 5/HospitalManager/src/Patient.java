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

public class Patient extends Person implements Comparable<Patient>{
	protected Date admissionDate;
	protected Integer age;
	protected LinkedList< Visit > visits;

	public Patient( int id, String name, int age ){
		// Add code here
                super(id,name);
                this.age = age;
                visits = new LinkedList< Visit >();
	}
	
	public void addVisit( Visit v ){
		// Add code here
                visits.add(v);
	}
		
	public void setAdmissionDate( Date d ){
		// Add code here
                this.admissionDate = d;
	}
	
	public Date getAdmissionDate(){
		// Add code here
                return this.admissionDate;
	}
	
	public void setAge( Integer age ){
		// Add code here
                this.age = age;
	}
	
	public Integer getAge(){
		// Add code here
                return this.age;
	}

	public int compareTo( Patient p ){
		// Add code here i'm not sure if is like this!!!!!!!!!!
                
                return this.admissionDate.compareTo(p.getAdmissionDate());
	}
	
	public String toString(){
		// Add code here
                String sid = String.valueOf(this.id);
                String sage = String.valueOf(this.age);
                return (name + " (ID " + sid +", age " + sage + ")");
	}
}
