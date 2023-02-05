// Write a program Leapyear or Not.
import java.util.Scanner;
class Leapyear{
  public static void main(String args[]){
    int year;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Year");
    year=sc.nextInt();
    if((year%4==0)&&(year%100!=0)||(year%400==0))
       {
     System.out.println("This is leapyear"); 
    }
    else{
      System.out.println("This is not leapyear");
    }
      
}
}
