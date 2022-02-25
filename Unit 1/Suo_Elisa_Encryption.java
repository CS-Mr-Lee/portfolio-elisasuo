/**
* Name: Elisa Suo
* Date: Feb 10, 2022
* Description: Code a program which encrypts a line of code. 
*              First and last character of each word are echanged
*              Middle character are shifted to the character two after it in the ASCII table
*              Space are kept and unchanged
*/

import java.util.*;

public class Suo_Elisa_Encryption{
   public static void main (String args[]){
      //create a new scanner
      Scanner in = new Scanner(System.in);
      
      //declare variables
      String text;
      int countText = 0;

      //Ask user a text
      System.out.print("Enter a text that needs to be encrypted: ");
      text = in.nextLine();
     
      //delcare char list
      char[] ch = text.toCharArray();
      
      //encrypt the line
      for (int i = 0; i < ch.length; i++){
         countText++;
         //If detects a space, it will encrypt the previous word
         if (ch[i] == ' '){
            char a = ch[i - countText + 1];
            ch[i - countText + 1] = ch[i - 1];
            ch[i - 1] = a;
            countText = countText - 1;
            // starts encrypting the insides when the words has 3 or more letters
            if (countText > 3){
               int c = 2;
               for (int j = countText - 2; j > 0; j--){  
                  int ascii = ch[i - c];
                  ascii = ascii + 2;
                  ch[i - c] = (char)ascii;
                  c++;
               }
            }
            countText = 0;//Ready for the next loop
         }
         
         //For the last word(if cant detect a space)
         if (i == ch.length - 1 && ch[ch.length - 1] != ' '){
            char a = ch[i];
            ch[i] = ch[i - countText + 1];
            ch[i - countText + 1] = a;
            if (countText > 3){
               int c = 1;
               for (int j = countText - 2; j > 0; j--){  
                  int ascii = ch[i - c];
                  ascii = ascii + 2;
                  ch[i - c] = (char)ascii;
                  c++;
               }
            }
         }
      }
      //output the result
      System.out.print(String.valueOf(ch));
   }//end main()
}//end class