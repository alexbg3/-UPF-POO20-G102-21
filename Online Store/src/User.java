/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aristrasser
 */
public class User {
    String name;
    String identifier;
    String password;
    
    public User(String n, String id, String pass){
        this.name = n;
        this.identifier = id;
        this.password = pass;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.identifier;
    }
    
    public String getPass(){
        return this.password;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public boolean login(String p){
        return (this.password.equals(p));
    }
    
}
