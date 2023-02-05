//Write a Program to enter principle amount, Total Number of Months, and Rate of Intrest , Calculate Simple Intrest      & Total Amount?
import java.util.Scanner;
class Rate
{
	public static void main(String[] args) {
    
    float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
  }
}