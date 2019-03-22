package inheritanceConcepts;

public class HONDA extends Cars {
	public HONDA(int startSpeed) {
		super (startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing Speed of Honda ::::::::");
		super.increaseSpeed();
	}
	public void DisplayNavigation() {
		System.out.println("Display Functionality :::::");
	}

}
