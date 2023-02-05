//Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,Calculate Total units & Electricity bill and print the report.
import java.util.Scanner;
class Reading {
  public static void main(String args[]) {
    int cno,pmr,lmr,tu;
    String cname;
    float cbill;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter consumer number:");
    cno = sc.nextInt();
    System.out.println("Enter consumer Name:");
    cname = sc.next();
    System.out.println("Enter Present Month Reading:");
    pmr = sc.nextInt();
    System.out.println("Last Month Reading:");
    lmr = sc.nextInt();
    

    tu=pmr-lmr;
    cbill= tu*3.80f;
    System.out.println("consumer number:" + cno);
    System.out.println("consumer name:" + cname);
    System.out.println("Present Month Reading:" + pmr);
    System.out.println("Last Month Reading" + lmr);
    System.out.println("total units:" + tu);
    System.out.println("consumer bill:" + cbill);
    

  }
}
   