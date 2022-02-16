/**
* Name: Elisa Suo
* Date: Feb 9, 2022
* Description: Find the smallest degree in a triangle by asking user to input 2 sides and an angle in between in radius. 
*/

import java.util.Scanner;

public class Suo_Elisa_SASTriangleSolver {
   
   //main()
    public static void main(String[] args) {
        //create an object of the class and use any of the available methods found in the Scanner class
        Scanner  In = new Scanner (System.in);
        
        //declare variables for program
        double a, b, c; //side
        double A, B, C, smallestAngle;//angle
        
        //get values from user using scanner In() 
        System.out.println("What's the length for first side?");
        b = In.nextDouble();
        System.out.println("What's the length for second side?");
        c = In.nextDouble();
        System.out.println("What's the angle in between two sides? (in radius)");
        A = In.nextDouble();
        A = Math.toDegrees(A); //transferring radius to degree
       
        //use law of cosine to find the value of side a
        a = Math.sqrt((Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(Math.toRadians(A))));

        //find angle B by using sinA/a = sinB/b
        B = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A))) * b / a));
        
        //calculate angle C
        C = 180 - A - B;

        //find the minimum angle between smallestAngle from above and angle C
        smallestAngle = Math.min(Math.min(A, B), C);
        
        //output the message
        System.out.println("The smallest angle in a triangle in degree is " + Math.floor(smallestAngle) + ".");
  
   }//end main()
}//end class


    
         