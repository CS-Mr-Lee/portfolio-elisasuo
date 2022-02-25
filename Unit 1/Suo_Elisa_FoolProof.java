/**
* Name: Elisa Suo
* Date: Feb 10, 2022
* Description: This program repeatedly asked the numerator and divisor to calculate quotient.
* If user entered division by 0 or poor input data, give an error message. Then continues running.
* Exit immediately the program without any message when user entered the character "q" or "Q". 
*/

import java.util.*;

public class Suo_Elisa_FoolProof{
   public static void main (String args[]){
      //create an object of the class and use any of the available methods found in the Scanner class
      Scanner  in = new Scanner (System.in);
      
      //declare variables
      String numerator, divisor;
      double dNumerator, dDivisor, quotient;
      boolean loop = true;
      
      //while loop for the whole calculator
      do{
         try{
            //ask for the value
            System.out.print("Enter the numerator: ");
            numerator = in.nextLine();
            //if the user entered "q" or "Q", then quit immediately
            if (numerator.charAt(0)=='q' || numerator.charAt(0)=='Q'){
               loop = false;
            }
            else{
               dNumerator = Double.parseDouble(numerator);
               System.out.print("Enter the divisor: ");//ask for divisor
               divisor = in.nextLine();
               dDivisor = Double.parseDouble(divisor);
               
               //check if the divisor is 0
               if (divisor.equals("0")){
                  System.out.println("You can't divide " + numerator + " by " + divisor);//give an error message
                  System.out.print("\n");
               }
               else{
                  //calculatie quotient 
                  quotient = dNumerator / dDivisor;
                  System.out.print(numerator  + " / " + divisor + " is ");
                  if(dNumerator % dDivisor != 0){
                     System.out.printf("%.2f", quotient);
                     System.out.println("\n");
                  }//end if
                  else{
                     System.out.printf("%.0f", quotient);
                     System.out.println("\n");
                  }//end else
               }//end else
            }//end else
         }
         //If entered a poor input data, give an error message
         catch (NumberFormatException  e){
            System.out.println("You entered bad data.");
            System.out.println("Please try again." + "\n");            
         }
      }while(loop);
      
   }//end main()
}//end class