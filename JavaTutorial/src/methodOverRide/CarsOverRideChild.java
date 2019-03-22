package methodOverRide;
/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */



public class CarsOverRideChild extends CarsOverRidingParent{

	public static void main(String[] args) {
		CarsOverRidingParent c1= new CarsOverRideChild();
		c1.increaseSpeed();
		c1.engineStart(8);
		
	}
	public void engineStart(int cylender) {
		System.out.println("I am from the Child Class");
	}
	public static void staticExample() {
		System.out.println("I am the Static Method from the Child Class");
	}
}
