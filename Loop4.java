// Write a program sum of n natural numbers.
import java.util.Scanner;
class Loop4{
  public static void main(String args[]){
    int i=1,fact=1;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    while(i<=n){
      fact=fact*i;
      i++;
    }
    System.out.println("the sum of n natural numbers is"+fact);
  }
}