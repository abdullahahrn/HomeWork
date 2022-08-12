package hw3JavaVariables;

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

		System.out.println(
				"My Name is : " + aboutMe.name + "\nMy Age is : " + aboutMe.age + "\nMonthly Car Finance Rate is : "
						+ aboutMe.monthlyCarFinanceRate + "\nMy Yearly Salary is : " + aboutMe.myYearlySalary);

	}

}
