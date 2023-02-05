//Create a program that uses a switch case statement to determine the number of days in a month based on the month number.
import java.util.Scanner;
class Months {
  public static void main(String args[]) {

    int month;
    int day;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter enter month value:");
    month = Sc.nextInt();
    switch(month)
      {
          case 4: 
          case 6:
          case 9:
          case 11:
          System.out.println("This month is 30 days");
          break;
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
          System.out.println("This month is 31 days");
          break;
          case 2:
          System.out.println("This month is 28 days");
          break;
        default:
          System.out.println("this is invalid month");
      }

  }
}