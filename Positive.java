//Write a program number is positive or negative.
import java.util.Scanner;
class Positive
{
  public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      num=sc.nextInt();
      
    if(num>0){
      System.out.println("Number is positive");
    }
    else{
      System.out.println("Number is negative");
    }
  }
  
}