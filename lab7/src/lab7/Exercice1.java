package lab7;

import java.io.IOException;

public class Exercice1{

   public static void main(String args[]) {		
      try{
    	  randomException();
      }
      catch( Exception e){
    	  System.out.println(e);
      }

      
   }
   public static void randomException() throws Exception{
      int exceptionNumber=(int)(Math.random()*5) + 1;
      if(exceptionNumber==1){
	throw new Exception(); 
      }
      if(exceptionNumber==2){
	throw new ArrayIndexOutOfBoundsException(); 
      }
      if(exceptionNumber==3){
	throw new IOException(); 
      }
      if(exceptionNumber==4){
	throw new IllegalArgumentException(); 
      }
      if(exceptionNumber==5){
	throw new NullPointerException(); 
      }      
   }
}
