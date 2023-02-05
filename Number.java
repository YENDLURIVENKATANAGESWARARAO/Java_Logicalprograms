//write a program even or odd.
import java.util.Scanner;
class Number
{
  public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      num=sc.nextInt();
      
    if(num%2==0){
      System.out.println("Number is even");
    }
    else{
      System.out.println("Number is OOd");
    }
  }
  
}