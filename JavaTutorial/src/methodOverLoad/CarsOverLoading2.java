package methodOverLoad;

//Three ways to achieve method overloading
//1. Different Number of parameters in arguments list
//2. Difference in data type of arguments
//3. Difference is sequence of data type of arguments


public class CarsOverLoading2 {
	
	
	
// This is Difference in data type of arguments
	
	public static void main(String[] args) {
		increaseSeatHeight(6);
		increaseSeatHeight("9");
		

	}
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat Height by  " +  heightToIncrease +  "  Inches. I am the integer one.");
	}
	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increased seat Height by  " +  heightToIncrease +  "  Inches I am the String one. ");
	}
	
	

}
