package inheritanceConcepts;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed= 0;
		Cars c1= new Cars(speed);
		c1.increaseSpeed();
		
		HONDA honda1 = new HONDA(speed);
		honda1.increaseSpeed();
		honda1.DisplayNavigation();
		
		

	}

}
