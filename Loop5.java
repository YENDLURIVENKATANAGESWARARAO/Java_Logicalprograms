//Write a program sum of n natural numbers.
// Method 2
import java.util.Scanner;
class Loop5{
  public static void main(String args[]){
    int fact =1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(num>0){
      fact=fact*num;
      num--;
    }
    System.out.println("the sum of n natural numbers is"+fact);
  }
}