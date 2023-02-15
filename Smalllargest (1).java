import java.util.Arrays;

public class Smalllargest{

public static void main(String args[]) {

int largest = Integer.MIN_VALUE;

int smallest = Integer.MAX_VALUE;
int[] numbers= numbers;
for (int number : numbers) {

if (number > largest) {

largest = number;

}

else if (number < smallest) {

smallest = number;

} }
System.out.println("Largest is : " + largest);

System.out.println("Smallest is : " + smallest); } }