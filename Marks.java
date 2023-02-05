//Write a program Student marks details.
import java.util.Scanner;
class Marks {
  public static void main(String args[]) {
    int sno,m,p,c;
    String name;
    float avg;
    double total;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student number:");
    sno = sc.nextInt();
    System.out.println("Enter student Name:");
    name = sc.next();
    System.out.println("Enter maths marks:");
    m = sc.nextInt();
    System.out.println("Enter physcis marks:");
    p = sc.nextInt();
    System.out.println("Enter chemistry marks:");
    c = sc.nextInt();

    total=m+p+c;
    avg=(m+p+c)/3;
    System.out.println("student number:" + sno);
    System.out.println("student name:" + name);
    System.out.println("maths marks:" + m);
    System.out.println("physics marks:" + p);
    System.out.println("physics marks:" + c);
    System.out.println("total marks:" + total);
    System.out.println("avg marks:" + avg);

  }
}