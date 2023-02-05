//Write a program Big number.
import java.util.Scanner;
class Nestedbig
{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a:");
      a=sc.nextInt();
      System.out.println("enter the value of b:");
      b= sc.nextInt();
    System.out.println("enter the value of c:");
      c= sc.nextInt();
    if(a>b){
    if(a>c){
      System.out.println("a is big");
    }
    else{
      System.out.println("c is big");
    }
      if(b>c){
      System.out.println("b is big");
      }
        
      else{
        System.out.println(" c isbig  ");
        }
      }
    }
    
  }
  
