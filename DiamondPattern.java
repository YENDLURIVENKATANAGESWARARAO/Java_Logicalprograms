/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {

//Add main method here
 public static void main(String[] args) {
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)
      int i, j, k, m;
      char ch=97;
       int row=3;
//use for loop and if condition to print a,b,c 
 for(i=0;i<row;i++) {
      for(j=0;j<row-i-1;j++) {
        System.out.print("  ");
      }
      for(j=0;j<=i;j++) {
        System.out.print(ch+ " ");
        ch++;
      }
      ch=97;
      for(j=i-1;j>=0;j--) {
        System.out.print((char)(ch+j)+ " ");
      }
      System.out.println();
      ch=97;
    }
    for(k=row-2;k>=0;k--) {
      for(m=0;m<row-k-1;m++) {
        System.out.print("  ");
      }
      for(m=0;m<=k;m++) {
        System.out.print(ch+ " ");
        ch++;
      }
      ch=97;
      for(m=k-1;m>=0;m--) {
        System.out.print((char)(ch+m)+ " ");
      }
      System.out.println();
      ch=97;
    }
  }
}