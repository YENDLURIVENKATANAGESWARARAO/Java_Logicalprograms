/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Swapping {

<<<<<<< HEAD
//main method
  public static void main(String[] args) {
=======
//main method
  public static void main(String[] args) {


>>>>>>> 0d2d43bcb2ea109481d037046b151e03a75c920b
  //Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
 // Take input from user
  System.out.println("Enter first number: ");
<<<<<<< HEAD
  int x=sc.nextInt();
System.out.println("Enter second number: ");
  int y=sc.nextInt();
    System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
//swapping two numbers without using third variable
    x=x+y;
    y=x-y;
    x=x-y;
    
=======
  int x=sc.nextInt();
System.out.println("Enter second number: ");
  int y=sc.nextInt();
    System.out.println("Enter temp value: ");
  int temp=sc.nextInt();
    System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


//swapping two numbers without using third variable
    temp = x;
        x = y;
        y = temp;
>>>>>>> 0d2d43bcb2ea109481d037046b151e03a75c920b

//print result
    System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


  }
}

//you should not use third variable.
