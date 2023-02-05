//Write a program sesaons program. 
import java.util.Scanner;

class Month {
  public static void main(String args[]) {

    int month;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter enter month value:");
    month = Sc.nextInt();
    switch(month)
      {
          case 3:
          case 4:
          case 5:
          case 6:
          System.out.println("this is summer sesaon");
          break;
          case 7:
          case 8:
          case 9:
          case 10:
          System.out.println("this is raniy sesaon");
          break;
          case 11:
          case 12:
          case 1:
          case 2:
          System.out.println("this is winter season");
          break;
        default:
          System.out.println("this is invalid month");
      }

  }
}
