//write a program strong number or not.
import java.util.Scanner;
class Loop11
{
    public static void main(String[] args) {
        
        int n;
        
        int sum=0;
        int rem=0;
        int fact=0;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    int tem=n;
    
        while(n > 0){     
            rem=n%10;  
            fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;     
        }
        
    if(tem==sum){
            System.out.println("The given number is strong number");
    }
    else{
        System.out.println("The given number is not strong number");
    }
        
        
        
    }
}