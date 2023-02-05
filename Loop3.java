//Write a program sum of numbers.
import java.util.Scanner;
 class Loop3 
{
    public static void main(String args[])
    {
        int x =5, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of numbers is :"+sum);
    } 
}