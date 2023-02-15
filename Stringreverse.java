//Write a JAVAprogram to find reverse of a string.
class Stringreverse
 {
 public static void main(String args[])
 {
    String st1="welcome";
   String reverse=" ";
   for(int i=st1.length()-1;i>=0;i--)
     {
       
       reverse=reverse+st1.charAt(i);
     }  
   System.out.println("The reverse of given string is:"+reverse);
   
}
}