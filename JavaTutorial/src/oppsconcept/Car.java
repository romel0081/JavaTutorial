package oppsconcept;

public class Car {
	// Color
	private String color;
	
	// Make
	private String make;
	
	//Model
	private String model;
	
	// Year
	private int year;
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	public String getMake() {
		return make;
		
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
