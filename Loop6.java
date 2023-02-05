//Write a program primenumber or not.
import java.util.Scanner;
class Loop6{
  public static void main(String args[]){
  int i=1,num, count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value:");
   num=sc.nextInt();
    while(i<=num){
      if(num%i==0){
        count++;
      }
      i++;
    }
    if(count==2){
      System.out.println("It is primenumber");
    }else{
      System.out.println("It is not primenumber");
    }
}
}