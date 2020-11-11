
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Program {
    LinkedList<Instruction> instructions;
    int currentLine;
    int loopIteration;
    String programName;
    int repeatStartLine; /*The line from which the repetitions start  */

    public Program(String name) {
        this.programName = name;
        currentLine = 0;
        this.instructions = new LinkedList<Instruction>();  
    }



    public String getName(){
        return this.programName;
            }
    public void setName(String p){
        this.programName = p;
    }
  
    public void restart(){}
    public boolean addInstruction( String c, int p){
        Instruction a = new Instruction ( c , p);
        instructions.add(a);
        return true;
    }
    public boolean hasFinished(){
        return currentLine == instructions.size();
                }
    public Instruction getNextInstruction(){
          Instruction aux = this.instructions.get(currentLine);
          currentLine ++;
    
          if( aux.isRepInstruction()){
              loopIteration = aux.getParameter();
              repeatStartLine = currentLine;
            }
          if(aux.code.equals("END")){
              loopIteration --;
              if( loopIteration >0){
                  goToStartLoop();
              }
          }
          return aux;
    }
    public void printErrors(){

    }
    private void goToStartLoop(){
        currentLine = repeatStartLine;
    }

    

    boolean isCorrect() {
        return true;
    }
    public Instruction getCurrentInstruction(){
        Instruction instruction = this.instructions.get(currentLine);
        return instruction;
    }

}
