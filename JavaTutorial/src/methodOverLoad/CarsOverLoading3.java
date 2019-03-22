package methodOverLoad;

//Three ways to achieve method overloading
//1. Different Number of parameters in arguments list
//2. Difference in data type of arguments
//3. Difference is sequence of data type of arguments


public class CarsOverLoading3 {
	
	//This is  Difference is sequence of data type of arguments

	public static void main(String[] args) {
		increaseSeatHeight(2,"12");
		increaseSeatHeight("10",9);
		
		

	}
	public static void increaseSeatHeight(int variable1, String variable2) {
		System.out.println("I am the 1st OverLoad " );
	}
	public static void increaseSeatHeight(String variable2, int variable1) {
		System.out.println("I am the 2nd OverLoad ");
	}
	

}
