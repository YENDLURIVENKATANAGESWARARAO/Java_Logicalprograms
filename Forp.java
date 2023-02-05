// palindrome number or not using method and for loop
import java.util.Scanner;
class palindrome{
  
    int sum,r,tem;
    int num;
    Scanner sc= new Scanner(System.in);
  void palindromeNumber(){
    System.out.println("enter the number:");
    num=sc.nextInt();
    tem=num;
    for(sum=0;num>0;){
      r=num%10;
      sum=sum*10+r;
      num=num/10;
    }
    if(tem==sum){
      System.out.println("the given num is palindrome");
    }
    else {
      System.out.println("the given number is not palindrome number:");
    }
  }
}
class Forp{
  public static void main(String args[]){
    palindrome p1=new palindrome();
    p1.palindromeNumber();
  }
}
