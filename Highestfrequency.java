//Write a JAVAprogram to find highest frequency character in a string.
import java.util.Scanner;
class Highestfrequency{
  public static void main(String args[]){
    String str;
    char ch;
    int i,count,max=0,min=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    str=str.toLowerCase();
    for(ch='a';ch<='z';ch++){
      count=0;
      for(i=0;i<str.length();i++){
       char chr=str.charAt(i);
        if(ch==chr)
          count++;
      }
      if(max<count){
        max=count;
      }
    }
System.out.println("the highest frequency of given string is:"+max);
  }
}