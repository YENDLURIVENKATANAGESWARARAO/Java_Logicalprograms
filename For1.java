// Write a program Factorial number.
import java.util.Scanner;
 class For1 
{
    public static void main(String args[])
    {
        int num, fact ;
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(fact=1;num>=1;num--)
        {
          fact=fact*num;
          
        }
      System.out.println("the factorial of given number is:"+fact);
        
    } 
}