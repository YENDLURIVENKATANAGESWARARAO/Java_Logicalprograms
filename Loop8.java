//Write a program multiplication table.
import java.util.Scanner;
class Loop8{
   public static void main(String args[]){
    int a=1,num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    num = sc.nextInt();
     while(a<num){
       if(a>=1&&a<=10){
     System.out.println(a+"*"+1+"="+a*1);
     System.out.println(a+"*"+2+"="+a*2);
     System.out.println(a+"*"+3+"="+a*3);
     System.out.print(a+"*"+4+"="+a*4);
     System.out.print(a+"*"+5+"="+a*5);
     System.out.print(a+"*"+6+"="+a*6);
     System.out.print(a+"*"+7+"="+a*7);
     System.out.print(a+"*"+8+"="+a*8);
     System.out.print(a+"*"+9+"="+a*9);
     System.out.print(a+"*"+10+"="+a*10);
       }
     
       a++;
     }
}
}