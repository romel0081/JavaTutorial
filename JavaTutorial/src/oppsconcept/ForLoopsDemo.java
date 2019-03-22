package oppsconcept;

public class ForLoopsDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("The Value Of  i is ::::::"  + i);
		}
		int[] numbers = {10,20,30};
		for(int i = 0; i< numbers.length;i++) {
			System.out.println("The Value Of Index " +i+ "   is::::  "+ numbers[i]);
		}
		for(int number: numbers) {
			System.out.println("The Value is :::::"+number);
		}
		String[] cars = {"BMW", "AUDI","HONDA","TOYOTA"};
		for(String car: cars) {
			
			System.out.println(car);
			
		}
	}

}
