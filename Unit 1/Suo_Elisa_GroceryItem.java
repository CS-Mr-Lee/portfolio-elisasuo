/**
* Name: Elisa Suo
* Date: Feb 8, 2022
* Description: This program asks user to input two grocery items and their prices. Print out them in required format.
*/
import java.util.Scanner;

public class Suo_Elisa_GroceryItem {
   final static double TAX = 0.13;
   
   //main()
    public static void main(String[] args) {
        //create an object of the class and use any of the available methods found in the Scanner class
        Scanner  In = new Scanner (System.in);
        
        //declare variables for program
        String grocery1, grocery2;
        double price1, price2;
        
        //get values from user using scanner In() 
        System.out.println("What's the 1st grocery item you bought? (not exceed 20 characters)");
        grocery1 = In.nextLine();
                
        // ask user to reenter a item name that <= 20 characters
        if (grocery1.length()>20){
            do { 
               System.out.println("Re-eneter a item name that not exceed 20 characters.");
               grocery1 = In.nextLine();
            } while(grocery1.length()>20); //if exceed, continues asks user to input
        }//end if
        
        // collect a name of item from user
        System.out.println("What's the 2nd grocery item you bought? (not exceed 20 characters)");
        grocery2 = In.nextLine();
        
        // if exceed 20 characters, ask user to reenter a item name that <= 20 characters
        if (grocery2.length()>20){
            do { 
               System.out.println("Re-eneter a item name that not exceed 20 characters.");
               grocery2 = In.nextLine();
            } while(grocery2.length()>20); //if exceed, continues do loop
        }//end if
        
        // asks for the 1st price of grocery item
        System.out.println("What's the first item price?");
        price1 = In.nextDouble();
        
        // if exceed $99, asks user to reentered
        if (price1 > 99){
            do { 
               System.out.println("Please enter a price under $99.");
               price1 = In.nextDouble();
            } while(price1 > 99);//if still exceeds, continue to ask user to input 
        }//end if
        price1 = price1 * TAX + price1;//add tax to the original price
        
        //price of 2nd grocery item
        System.out.println("What's the second item price?");
        price2 = In.nextDouble();
        
        //if exceeds $99, ask user to input value <= $99
        if (price2 > 99){
            do { 
               System.out.println("Please enter a price under $99.");
               price2 = In.nextDouble();
            } while(price2 > 99); //continus loop until satisfies the conditions
        }//end if
        price2 = price2 * TAX + price2;//add tax
        
        //display the result as required formatted
        System.out.println("----------------------");
        System.out.printf("%2s%6s%4.2f\n", "Grocery #1", "$" , price1);
        System.out.printf("%2s%6s%4.2f\n", "Grocery #2", "$" , price2);
        System.out.println("----------------------");
        
        }//end main()
    
}//end class

   
   