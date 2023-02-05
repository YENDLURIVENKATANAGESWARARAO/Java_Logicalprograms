//Write a program week numbers program.
import java.util.Scanner;
class Week {

  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the week number:");
      n=sc.nextInt();

    if (n == 0) {
      System.out.println("Sunday");
    }
    else if (n == 1) {
      System.out.println("Monday");
    }
    else if (n == 2) {
      System.out.println("Tuesday");
    }
    else if (n == 3) {
      System.out.println("Wedneday");
    }
    else if (n == 4) {
      System.out.println("Thurday");
    }
    else if (n == 5) {
      System.out.println("Friday");
    }
    else if(n == 6)
      System.out.println("Sarurday");
  }
}