package hw4JavaVariables;

/*
 * Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's meaningful info.
 * 
 *  Create another class AboutMeTest. Instantiate AboutMe class under main method. Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and push to the github and paste the link of github below. [Mark distribution (100) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 15  variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 10, organize code and other-- 25]. push your code to github -- 10. share the package link below.
 */
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
