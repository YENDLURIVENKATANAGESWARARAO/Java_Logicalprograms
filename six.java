//write a program addition of two numbers.
import java.util.Scanner;

class six {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integer value1:");
    a = sc.nextInt();
    System.out.println("Enter integer value2:");
    b = sc.nextInt();
    System.out.println("This given value is:" + a);
    System.out.println("This given value is:" + b);
    System.out.println("The addition of two numbers (a+b)="  +(a + b));

  }
}