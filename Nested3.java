/*
Draw a pattern
                      *
                  *   *
              *   *   *
           *  *   *   *
        *  *  *   *   *   */
//import java.util.Scanner;
class Nested3{
  public static void main(String args[]){ 
    int i,j;
    /*Scanner sc = new Scanner(System.in);
    System.out.println("enter the value:");
    row=sc.nextInt();*/
    for(i=1;i<=5;i++)
      {
        for(j=1;j<=5;j++)
          {
             
            if(i+j<=5)
              System.out.print("  ");
            else
              System.out.print(" * ");
            }
          
        System.out.println();
      }
  }
}