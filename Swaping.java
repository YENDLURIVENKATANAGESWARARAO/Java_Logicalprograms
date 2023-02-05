//Write a Program for Swapping of Two number without using Temp Variable?
import java.util.Scanner;
public class Swaping
{
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
    int a,b,t;
    System.out.println("Enter a,b values: ");
     a=sc.nextInt();
      b=sc.nextInt();
        System.out.println("Before Swaping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
 
        t=a;
        a=b;
        b=t;
 
        System.out.println("After swaping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
  }
}