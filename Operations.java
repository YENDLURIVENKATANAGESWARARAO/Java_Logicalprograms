/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String[] args) 
  {

 // Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);



  //Take input from user
    System.out.println("Enter first number: ");
    int firstNumber=sc.nextInt();
    System.out.println("Enter the second number: ");
    int secondNumber = sc.nextInt();
    System.out.println("Enter the third number: ");
    int thirdNumber = sc.nextInt();
    System.out.println("Enter the fourth number: ");
    int fourthNumber = sc.nextInt();
    System.out.println("Enter the fifth number: ");
    int fifthNumber = sc.nextInt();
    System.out.println("Enter the sixth number: ");
    int sixthNumber = sc.nextInt();
    System.out.println("Enter the seventh number: ");
    int seventhNumber = sc.nextInt();
    System.out.println("Enter the eighth number: ");
    int eighthNumber = sc.nextInt();
    System.out.println("Enter the nineth number: ");
    int ninethNumber = sc.nextInt();


//calculate difference,product,division,increment and remainder
    seventhNumber++;
    seventhNumber--;

//print appropriate result for all operations
    System.out.println("Difference of two numbers: " + (firstNumber - secondNumber));
    System.out.println("Product of two numbers: " + (thirdNumber * fourthNumber));
    System.out.println("Division of two numbers: " + (fifthNumber / sixthNumber));
    System.out.println("Increment and Decrement the number: " + (seventhNumber++) + +(seventhNumber--));
    System.out.println("Remainder of two numbers: " + (eighthNumber % ninethNumber));
  }
}