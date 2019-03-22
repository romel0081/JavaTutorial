package methodOverLoad;
//Three ways to achieve method overloading
//1. Different Number of parameters in arguments list
//2. Difference in data type of arguments
//3. Difference is sequence of data type of arguments


// This one Different Number of parameters in arguments list

public class CarsOverLoading1 {

	public static void main(String[] args) {
		increaseSeatHeight(5);
		increaseSeatHeight(7,true);
		

	}
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat Height by " +  heightToIncrease +  " Inches");
	}
	
	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
		System.out.println("Increased seat Height by " + heightToIncrease +  " Inches");
		if(rememberHeight) {
			System.out.println("Your Selection is Saved");
		}else {
			System.out.println("Your Selection is Not Saved");
		}
	}

}
