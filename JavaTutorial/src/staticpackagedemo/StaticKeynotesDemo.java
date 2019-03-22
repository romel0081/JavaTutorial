package staticpackagedemo;

public class StaticKeynotesDemo {
	
	// Static Method cannot use the non-static variable or method directly
	// This and Super cannot be used in static context
	
	public int addNum = 10;
	public static int addNumStatic = 10;

	public static void main(String[] args) {
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();
		int output = s1.sum(20);
		int staticOutput = sumStatic(10);
		System.out.println("The Output is :::" + output);
		System.out.println("The Output is :::" + staticOutput);
		
		
	}
	public int sum(int num) {
		return num +addNum;
	}
	public static int sumStatic(int num) {
		return num +addNumStatic;
	}

}
