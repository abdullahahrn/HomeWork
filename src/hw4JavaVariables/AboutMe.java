package hw4JavaVariables;

public class AboutMe {

	public String name;// variables declared
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	// Constructor Declared.
	public AboutMe() {
		System.out.println("This is all about us");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My name is: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nMy Yearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Height: "
				+ myHeight + "\nmyGrad" + myGrade + "\nSex: " + sex + "\nUS Citizen: " + usCitizen);
	}

}
