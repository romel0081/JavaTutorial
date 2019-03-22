package staticpackagedemo;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExampleClass s1 = new StaticExampleClass("BMW");
		System.out.println("Make Of Car is ::::"+s1.getMake());
		System.out.println("This is Instance Number ::::"+ StaticExampleClass.getInstanceNum());
		
		
		StaticExampleClass s2 = new StaticExampleClass("HONDA");
		System.out.println("Make Of Car is ::::"+s2.getMake());
		System.out.println("This is Instance Number ::::"+ StaticExampleClass.getInstanceNum());


	}

}
