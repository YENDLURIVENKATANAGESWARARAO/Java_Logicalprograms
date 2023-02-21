<<<<<<< HEAD
/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {

//main methodScanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

//check if the second number is greater than zero then increase first number and decrease second number
     int sum = 0;

    if (num2 > 0) {
        while (num2 != 0) {
            sum = ++num1;
            num2--;
        }
    }
//check if the second number is less than zero then decrease first number and increase second number
         else if (num2 < 0) {
        while (num2 != 0) {
            sum = --num1;
            num2++;
        }
    }
//print result
System.out.println("The sum is: " + sum);
}
}
=======
/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {

//main method
  public static void main(String[] args)
  {


  //Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);



  //Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
System.out.print("Enter the second value:");
    int b=sc.nextInt();


//check if the second number is greater than zero then increase first number and decrease second number

//check if the second number is less than zero then decrease first number and increase second number

//print result
System.out.println("The sum of two number:"+(a+b));

}
 }

//you should not use + operator
>>>>>>> 0d2d43bcb2ea109481d037046b151e03a75c920b
