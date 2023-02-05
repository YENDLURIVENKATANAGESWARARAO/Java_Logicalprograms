//Write a Program to Enter Product Number, Product Name, Product Cost, Product Quantity, calculate Bill Amout and print the report?
import java.util.Scanner;

class Product {
  public static void main(String args[]) {
    int epno;
    String ename;
    float pcost;
    int pqu;
    double bill;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter product number:");
    epno = sc.nextInt();
    System.out.println("Enter product Name:");
    ename = sc.next();
    System.out.println("Enter product cost:");
    pcost = sc.nextFloat();
    System.out.println("Enter product quenitity:");
    pqu = sc.nextInt();

    bill = pcost * pqu;
    System.out.println("Product number:" + epno);
    System.out.println("product name:" + ename);
    System.out.println("product cost:" + pcost);
    System.out.println("product quentity:" + pqu);
    System.out.println("total bill:" + bill);

  }
}