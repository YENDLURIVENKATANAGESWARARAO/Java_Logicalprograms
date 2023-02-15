//Write a JAVAprogram to find last occurrence of a character in a given string.
import java.util.Scanner;
public class Lastoccurence {
	public static void main(String[] args) {
		String lastcharstr;
		int i = 0, lIndex = -1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter String to find Last Occurrence =  ");
		lastcharstr = sc.nextLine();
		System.out.println("Enter the Last Character to Find =  ");
		int lsch = sc.next().charAt(0);
		while(i < lastcharstr.length())
		{
			if(lastcharstr.charAt(i) ==  lsch) {
				lIndex = i;
			}
			i++;
    }
			System.out.println("The Last Character Occurrence  position "+lIndex);	
	}

}