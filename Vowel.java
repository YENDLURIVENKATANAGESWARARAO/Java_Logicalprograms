//Write a program vowel or not
import java.util.Scanner;

class Vowel {
  public static void main(String args[]) {

    char Ch;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter any character value:");
    Ch = Sc.next().charAt(0);
    

    switch(Ch)
      {
          case 'a':case 'A':
          case 'e':case 'E':
          case 'i':case 'I':
          case 'o':case 'O':
          case 'u':case 'U':
          System.out.println("this is vowel");
          break;
        default: 
          System.out.println("this is consonent");
      }

  }
}
