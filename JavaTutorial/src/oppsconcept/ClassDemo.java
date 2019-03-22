package oppsconcept;

public class ClassDemo {

	public static void main(String[] args) {
	Car bmw = new Car();
	
	bmw.setMake("BMW");
	System.out.println("Model of this car is " + bmw.getMake());
	
	bmw.setColor("Black");
	System.out.println("Color of BMW is " + bmw.getColor());

	}

}
