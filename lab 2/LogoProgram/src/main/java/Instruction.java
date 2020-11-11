/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Instruction {
    String code;
    int parameter;
     
    public Instruction (String c, int p){
        this.code = c;
        this.parameter = p;
    }
    public void setCode(String c){
     this.code = c; 
     } 
     
    public String getCode(){
        return this.code;
    }
    public void setParameter(int p){
     this.parameter = p; 
     } 
    public int getParameter(){
        return this.parameter;
    }
    public boolean isRepInstruction(){
        return "REP".equals(this.code); 
    }
    
    public boolean isCorrect(){
         return "PEN".equals(this.code) ||"REP".equals(this.code) || "FWD".equals(this.code) ||"ROT".equals(this.code) || "END".equals(this.code);
  
    }
    public void errorCode(){
       if( !isCorrect()){
           System.out.println("Wrong parameter");    
       }
            
    }
    public String info(){
        if ("REP".equals(this.code)){ 
            return "Repeat"; 
            
         }else if ("PEN".equals(this.code)){ 
             return "Turn pencil on/off";
        }else if ("FWD".equals(this.code)){ 
             return "Forward";
        }else if ("ROT".equals(this.code)){ 
             return "Rotate";
        }else if ("END".equals(this.code)){ 
             return "END";
        }
        return "unknown instruction";
   } 
}   
