//Write a program radius of the cricle.
import java.util.Scanner;
class Cricle

  {
    float pi=3.14f;
    float area;
    
    void add(int r)
    {
     area = pi*r*r;
      System.out.println("The radius of the citcle is: "+area);
    
      
    }
  }
class Radius
  {
    public static void main(String []args)
    
    {
      Scanner sc = new Scanner(System.in);
      int r;
      Addition a1 = new Addition();
      System.out.println("Enter the radius of the cricle");
      r=sc.nextInt();
      a1.add(r);
    }
  }