package staticpackagedemo;

public class StaticExampleClass {
	public static int wheelsCount = 4;
	public String make;
	public static int instanceNum = 0;
	
	public  StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
		
	}

}
