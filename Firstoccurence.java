//Write a JAVAprogram to find first occurrence of a character in a given string.
import java.util.Scanner;
class Firstoccurence{
  public static void main(String args[]){
    String fc;
    char ch;
    Scanner sc=new Scanner (System.in);
    System.out.println("Please Enter the firstoccurence valu:");
      fc=sc.nextLine();
    System.out.println("Please Enter character:");
     ch=sc.next().charAt(0);
    int x=fc.indexOf(ch);
    System.out.println("The character position is:"+x);
    
  }
}