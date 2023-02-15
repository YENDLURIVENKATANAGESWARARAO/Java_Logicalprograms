//Write a JAVAprogram to check whether a string is palindrome or not.
import java.util.Scanner;
class Stringpalindrmo
 {
 public static void main(String args[])
 {
    
   String  reverse=" ";
   Scanner sc = new Scanner(System.in);    System.out.println("Enter a string check if it is a palindrome"); 
   reverse = sc.nextLine();
   for(int i=reverse.length()-1;i>=0;i--)
     {
       
       reverse=reverse+reverse.charAt(i);
     }
    if (reverse.equals(reverse))  
         System.out.println("Entered string is a palindrome:");  
      else  
         System.out.println("Entered string isn't a palindrome:");  
   
   
}
}