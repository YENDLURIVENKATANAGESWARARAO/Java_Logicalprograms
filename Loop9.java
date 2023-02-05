//Write a program multiplication table.
import java.util.Scanner;
class Loop9{
  public static void main(String args[]){
    int i=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(i<=10){
     System.out.println(num+"*"+i+"="+num*i);
      i++;
    }
  }
}