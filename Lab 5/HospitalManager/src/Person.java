/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class Person{
	public int id;
	public String name;
	
	public Person( int id, String name ){
		// Add code here
                this.id = id;
                this.name = name;
	}
	
	public int getID(){
		// Add code here
                return this.id;
	}
	public String getName(){
		// Add code here
                return this.name;
	}
	public void setID( int id ){
		// Add code here
                this.id = id;
	}
	public void setName( String name ){
		// Add code here
                this.name = name;
	}
	public String toString(){
		// Add code here
                String sid = String.valueOf(this.id);
                return (this.name + " (ID " + sid + ") ");
                
	}
}
