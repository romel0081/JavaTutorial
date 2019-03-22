package staticpackagedemo;

public class ReverseString {

	public static void main(String[] args) {
		String input = "This is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	private static String reverse(String input) {
		String reverse = "";
		
		if(input.length()<= 1) {
			reverse = input;
		}else {
			String[]orginalArray = input.split("\\s+");
			for(String item : orginalArray) {
				reverse = item + " " + reverse;
			}
		}
		
		return reverse.trim();
	}

}
