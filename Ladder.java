// given alphabet is ovel or consonent 

import java.util.Scanner;
class Ladder
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the alphabet:");
      ch=sc.next().charAt(0);
      if(ch=='a' || ch=='A'){
        System.out.println("Its ovel");
        }
      else if(ch=='e' || ch=='E'){
        System.out.println("Its ovel");
      }
      else if(ch=='i' || ch=='I'){
       System.out.println("Its ovel");
      }
      else if(ch=='o' || ch=='O'){
        System.out.println("Its ovel ");
      }
      else if(ch=='u' || ch=='U'){
        System.out.println("Its ovel");
      }
      else {
        System.out.println("Its a consonent");
      }
    }
  }