//1)to check the given number is EVEN or ODD using switch case 
import java.util.Scanner;
class Even{
  public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    num = sc.nextInt();
     switch(num%2)
        {
            case 0:
            System.out.println("even number:"+num);
             break;
            case 1:
            System.out.println("odd number:"+num);
             break;
          default:
            System.out.println("invalid");
        }
  }
}