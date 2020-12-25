/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aristrasser
 */
public class Visitor extends Patient // Add code here
{
	public Visitor( int id, String name, int age ){
		// Add code here
                super(id,name,age);
	}
	
	public String toString(){ 
		// Add code here
                String pat = super.toString();
                return ("Visitor " + pat);
	}
}