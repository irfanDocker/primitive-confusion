package solutions.techcircle.ObjectAndClasses;

public class Car{
	
	private String make;
	private String model;
	private int year;
	
	public String getMake() {
		return make;
	}
	
	public Car() {
		this("Tesla","Model X",2020);
		System.out.println("Car's default constructor");
		
	}
	
	public Car(String make, String model, int year) {

		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	public void setMake(String make) {
		this.make = make;
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
