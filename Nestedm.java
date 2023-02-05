/*
Draw a patern in methods
*
* *
* * *
* * * *
* * * *   */

class Nested{
  
    int i,j,num;
  void nest(int num){ 
     for(i=1;i<=num;i++)
     {            
     for(j=1;j<=i;j++)
     {
         System.out.print("*");
      }
     System.out.println();
   } 
  }
}
class Nestedm{
  public static void main(String args[]){
    int num;
    Nested en=new Nested();
    en.nest();
  }
}