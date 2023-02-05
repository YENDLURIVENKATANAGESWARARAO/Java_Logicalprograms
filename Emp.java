//Wtite a java program Employee details.
import java.util.Scanner;

class Emp {
  public static void main(String args[])
  {
     int eno;
    String ename;
    Float esal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the employee Number:");
    eno = sc.nextInt();
    System.out.println("Enter the employee name:");
    ename = sc.next();
    System.out.println("Enter the employee salary:");
    esal = sc.nextFloat();
    
   System.out.println("The Given Employee Number is:" +eno);
    System.out.println("The Given Employee Name is:" +ename);
    System.out.println("The Given Employee Salary is:" +esal);
  }
}