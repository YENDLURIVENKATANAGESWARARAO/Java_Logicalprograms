// Write a program Fibonacci series numbers.
import java.util.Scanner;
 class Fib 
{
    public static void main(String args[])
    {
        int n,x=0,y=0,z=1 ;
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for(int i=1;i<=n;i++)
        {
          System.out.print(x+"\t ");
          x=y;
          y=z;
          z=x+y; 
        }
    } 
}