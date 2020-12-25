/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */

import java.util.Date;

public class Visit{
	Date date;
	String summary;
	Doctor doctor;
	Patient patient;

	public Visit( Date d, String s, Doctor doc, Patient p ){
		// Add code here
                this.date = d;
                this.summary = s;
                this.doctor = doc;
                this.patient = p;
	}
	
	public Date getDate(){
		// Add code here
                return this.date;
	}
	public String getSummary(){ 
		// Add code here
                return this.summary;
	}
	public Doctor getDoctor(){ 
		// Add code here
                return this.doctor;
	}
	public Patient getPatient(){ 
		// Add code here
                return this.patient;
	}
	
	public String toString(){ 
		// Add code here ask for the output of a visit!!!!!!!!!!!!!!!!!
                return ("Visit");
	}
}
