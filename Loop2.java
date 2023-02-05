// Write a program n numbers print.
import java.util.Scanner;
class Loop2{
  public static void main(String args[]){
    int i=1;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    while(i<=n){

      System.out.println(i);
      i++;
    }
  }
}