//Take 3 subjects as input
//find total & average
//if  every subject above 40 marks print student pass otherwise fail
//if student is pass then allot the grade based on the average
  //if  average  below 50 ----> allot C Grade
//if  average  between 51-70  ----> allot B Grade  //if  average  between 71-80  ----> allot A Grade
//above 80 you need to print " Student Pass in Distension"
import java.util.Scanner;
class Subject  {
  public static void main(String args[]) {
    int m,p,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter maths marks:");
    m = sc.nextInt();
    System.out.println("Enter physcis marks:");
    p = sc.nextInt();
    System.out.println("Enter chemistry marks:");
    c = sc.nextInt();
    int avg;
    avg=(m+p+c)/3;
    if(m>=40 && p>=40 && c>=40){
      System.out.println("student is pass");
    
      if(avg<=50){
        System.out.println("student is grade C");
      }
        else if(avg>=51 && avg<=70){
          System.out.println("student is grade B");
          
        }
          else if(avg>=71 && avg<=80) {
            System.out.println("Student is grade A");
          }
  
            else{
              System.out.println("Student Pass in Distension");
            }
    }
  else {
      System.out.println("student is fail");
    }
    }
}

  

