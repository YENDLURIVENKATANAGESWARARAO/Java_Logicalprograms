//Write a program to convert temperature from Celsius to Fahrenheit and vice versa
import java.util.Scanner;
class Temperature{
    float Celsius,Fahrenheit ;
  //1 celsius= 33.8Fahrenheit
  //1 Fahrenheit=-17.22222Celsius
  
    Scanner sc=new Scanner(System.in);
  void Temperature(){
    System.out.println("Enter the celsius valu:");
    Celsius=sc.nextFloat();
    Fahrenheit =(((Celsius*9)/5)+32);
    System.out.println("Temperature in Fahrenheit is:" +Fahrenheit);   
  }
}
class Temperatur{
  public static void main(String args[]){
    Temperature te = new Temperature();
    te.Temperature();
    
}
}