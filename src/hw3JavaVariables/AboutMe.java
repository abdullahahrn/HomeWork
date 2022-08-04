package hw3JavaVariables;

/*
 * Create a package name "hw3JavaVariables" inside the Home work project, Create a Class name "AboutMe". Declare one type of variable(only one, so you know declare vs initialize), and initialize String and other 8 types of variable (you can try to give a different name from mine). Instantiate AboutMe class under main method and call few variables (not all) by object (you can use String concatenation to make it more meaningful outcome). Give a single line comment where a variable is declared and where is initialized (Example: // Variable declared). Follow indentation by Organizing the code and paste below.
 */
public class AboutMe {
	public String mobile;// variable declared
	public String name = "Abdullah Al Harun";// variable initialized
	public byte age = 29;
	public short monthlyCarFinanceRate = 700;
	public int myYearlySalary = 100000;
	public long myBankBalance = 453485666565569896l;
	public float myHeight = 5.984246f;
	public double myGrade = 3.522652654436;
	public char sex = 'M';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();// constructor initialized.
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.monthlyCarFinanceRate);
		System.out.println(aboutMe.myYearlySalary);
		System.out.println(aboutMe.myBankBalance);
		
		System.out.println("My Name is : " + aboutMe.name + "\nMy Age is : " + aboutMe.age + "\nMonthly Car Finance Rate is : " + aboutMe.monthlyCarFinanceRate + "\nMy Yearly Salary is : " + aboutMe.myYearlySalary);

	}

}
