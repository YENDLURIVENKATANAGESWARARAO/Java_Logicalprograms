//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation {

//Define main method
    public static void main(String[] args) {
//Declare a variable and initialize it as true or false
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Boolean value:");
       boolean b=sc.nextBoolean();
//Print the Result using not operator
  System.out.println(!b);
    }
}