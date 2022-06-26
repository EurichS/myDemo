import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
	    out.println("Hello in tic tac toe! Please,choose your side\n(Input \'x\'or\'o\')\nPress any key for random");
	    Scanner keyboard=new Scanner(System.in);
	    String s=keyboard.next();
	    Changeble x=symb->'X'; 
        Changeble y=symb->'O'; 
        Game a=new Game(s);
        do{
          a.gameProcess();
       }
       while(!(a.winCondition()));
	  
	     
	}
}
class Game{
    private static boolean playerFirst;
    private boolean nowTern=true;
    private static char[] field={'.','.','.',
                                '.','.','.',
                                '.','.','.'};
     private static HashSet<Integer> used=new HashSet<Integer>();                         
   Game(String s){
        if(s.equals("x")) playerFirst=true;
        if(s.equals("o")) playerFirst=false;
        else{
            Random rand=new Random();
            if(rand.nextInt(99)+1>50)playerFirst=true;
            else playerFirst=false;
        }
            if(playerFirst)out.println("You plays for X!");
            else out.println("You plays for O!");
            out.println("Choose position of your symbol from [1-9]");
            for(int i=0;i<9;i++){
            field[i]='.';
            if(i==3||i==6)out.println("");
            out.print(field[i]);
        }
   }
  void gameProcess(){
      Changeble x=symb->'X'; 
      Changeble y=symb->'O'; 
      int i;
      boolean b;
      Scanner keyboard=new Scanner(System.in);
          if(playerFirst){
               i=keyboard.nextInt();
               playerFirst=false;
               b= used.add(i);
          }
          else{
              do{
              Random rand=new Random();
              i= rand.nextInt(9)+1;
              b= used.add(i);
              }
              while(!b);
              playerFirst=true;
      }
      if(nowTern){
           new Field(i,x);
           nowTern=false;
      }
      else{
          new Field(i,y);
          nowTern=true;
      }
     

  }
  boolean winCondition(){
      if(((field[0]==field[1])&&(field[1]==field[2])&&field[0]!='.')||
      ((field[3]==field[4])&&(field[4]==field[5])&&field[3]!='.')||
      ((field[6]==field[7])&&(field[7]==field[8])&&field[6]!='.')||
      ((field[0]==field[3])&&(field[3]==field[6])&&field[0]!='.')||
      ((field[1]==field[4])&&(field[1]==field[7])&&field[1]!='.')||
      ((field[2]==field[5])&&(field[2]==field[8])&&field[2]!='.')||
      ((field[0]==field[4])&&(field[0]==field[8])&&field[0]!='.')||
      ((field[2]==field[4])&&(field[2]==field[6])&&field[2]!='.')){
          if(nowTern){
              out.println("tac victory!");
              return true;
      }
       if(!(nowTern)){
              out.println("tic victory!");
              return true;
      }
      }
  
      if(used.size()==9){
          out.println("Drow!");
          return true;
      }
      return false;
  }
        
   
     

class Field{
    
   
    Field(){
        for(int i=0;i<100;i++){
            out.println("");
        }
        for(int i=0;i<9;i++){
            field[i]='.';
            if(i==3||i==6)out.println("");
            out.print(field[i]);
        }
    }
    Field(int pos,Changeble method){
        field[pos-1]=method.change(field[pos-1]);
        for(int i=0;i<100;i++){
            out.println("");
        }
        for(int i=0;i<9;i++){
            if(i==3||i==6)out.println("");
            out.print(field[i]);
        }
        out.println("");
    }
}   
    
}
interface Changeble{
    char change(char symb);
}

