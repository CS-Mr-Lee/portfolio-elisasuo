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
    Scanner  In = new Scanner(System.in);

    //declare variables for program
    double a, b, c; //3 sides for a triangle
    double A, B, C, smallestAngle;//3 angles for a triangle

    //get values from user using scanner In()
    System.out.println("What's the length for first side?");
    b = In.nextDouble();
    System.out.println("What's the length for second side?");
    c = In.nextDouble();
    System.out.println("What's the angle in between two sides? (in radius)");
    A = In.nextDouble();
    A = transferA(A);//get angle A in degrees

    a = findSideA(b, c, A); // get a from the method findSideA
    B = findAngleB(a, b, A); //get angle B from the method findAngleB
    C = calAngleC(A, B); //get the angle C from the method calAngleC
    smallestAngle = minAngle(A, B, C); //get the smallestAngle from the method minAngle
    
    //output an message that tells which is the smalest angle in a triangle in degree
    System.out.println("The smallest angle in a triangle in degree is " + Math.floor(smallestAngle) + ".");

   }//end main()

   
   /**
   * this method transferring Angle A from radians to degree 
   * @param A the value given from the scanner that need to be transfered
   * @return double A in degree 
   */
   public static double transferA (double A){
   return A = Math.toDegrees(A); //transferring radians to degree
   }
   
   /**
   * this method find side a by using cosine law: a = sqrt((b^2+c^2-2bc(cosA)) 
   * @param b side b given by the scanner, helps to calculate the side a
   * @param c side c given by the scanner, helps to calculate the side a
   * @param A angle A in degrees
   * @return double the cosine law calculated results 
   */
   public static double findSideA (double b, double c, double A){
   return Math.sqrt((Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c * Math.cos(Math.toRadians(A))));
   }
   
   /**
   * this method find side a by using sine law: sina/A = sinb/B > B = sinA(b)/a 
   * @param a side a given by the method(findSideA), helps to calculate angle B
   * @param b side b given by the scanner, helps to calculate angle B
   * @param A angle A in degrees
   * @return double the sine law calculated results 
   */
   public static double findAngleB (double a, double b, double A) {
   return Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A))) * b / a));
   }
   
   /**
   * this method is to calculate the angle C by knowing two angle A and B 
   * @param A angle A given by the scanner, that helps to calculate 
   * @param B angle B calculated in the method findAngleB by using sine law
   * @return double the calculated results 
   */
   public static double calAngleC (double A, double B) {
   return 180 - A - B;
   }
   
   /**
   * this method find the smallest angle by using Math.min(); 
   * @param A angle A, given by the scanner
   * @param B angle B, the results obtained by method(findAngleB) calculation
   * @param C angle C, the results obtained by method(calAngleC) calculation
   * @return double minimum angle between angle A, B and C 
   */
   public static double minAngle (double A, double B, double C) {
   return Math.min(Math.min(A, B), C);
   }
   
}//end class


    
         