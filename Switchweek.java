//Write a program week days program.
import java.util.Scanner;
class Switchweek{
  public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter week number:");
    n = sc.nextInt();
     switch(n)
        {
            case 1:
            System.out.println("Monday");
             break;
            case 2:
            System.out.println("Tuesday");
             break;
            case 3:
            System.out.println("Wednesday");
             break;
           case 4:
            System.out.println("Thursday");
             break;
            case 5:
            System.out.println("friday");
             break;
            case 7:
            System.out.println("saturday");
             break;
          default:
            System.out.println("Invalid");
            
             
}
}
}