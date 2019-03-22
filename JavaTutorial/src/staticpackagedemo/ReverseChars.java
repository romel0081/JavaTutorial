package staticpackagedemo;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a string : ");
		String orginal = scan.nextLine();
		while(orginal.isEmpty() || orginal == null) {
			System.out.println("Please enter a valid string, empty and null strings are not accepted: ");
			orginal = scan.nextLine();
		}
		scan.close();
		
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(orginal);
		System.out.println(reverseCharacters);
	}
	private String reverseCharacters(String orginalString) {
		String reverse = "";
		for(int i = orginalString.length()-1; i >=0; i--) {
			reverse = reverse + orginalString.charAt(i);
	}
		return reverse;
	}

}
