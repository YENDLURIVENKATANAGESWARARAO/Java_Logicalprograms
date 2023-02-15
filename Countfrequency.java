//Write a JAVAprogram to count frequency of each character in a string.
import java.util.Scanner;
class Countfrequency{
  public static void main(String args[]){
    String str;
    char ch;
    int i,count;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    str=str.toLowerCase();
    System.out.println("The given string charecters frequency is:");
    for(ch='a';ch<='z';ch++){
      count=0;
      for(i=0;i<str.length();i++){
       char chr=str.charAt(i);
        if(ch==chr)
          count++;
      }
      if(count!=0)
      System.out.println(ch+"---"+count);
      
    }
  }
}