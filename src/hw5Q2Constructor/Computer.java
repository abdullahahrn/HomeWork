package hw5Q2Constructor;

public class Computer {

	public String brand;// variables declared
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	// Default Constructor Declared.
	public Computer() {
		System.out.println("This default constructor is form Employee Class.\n");

	}

	// parameterized constructor Declared.
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		System.out.println("My brand:" + brand + ", Model:" + model + ", Operating system:" + operatingSystem
				+ ", Price:" + price + ", Grade:" + grade + ", Ans:" + madeInUsa);
	}

}
