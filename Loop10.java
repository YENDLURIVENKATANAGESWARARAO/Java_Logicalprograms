//Write a program palindrom number or not
import java.util.Scanner;
class Loop10{
  public static void main(String args[]){
        int n, sum=0, rem=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    int tem=n;
    while(n>0){
      rem=n%10;    
      sum=sum*10+rem;
      n=n/10; 
    }
    
        if(tem==sum){
            System.out.println("The number is palindrom ");
        }
        else{
            System.out.println("The number is not paliondrome");
        }
}
}