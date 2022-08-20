package hw9Encapsulation;
/*Create a package name "hw9Encapsulation" in the HW project. Inside the package, a) Create a class, Employee and declare some private variables----> name, age, sex, usCitizen. How can you access those variables by the getter and setter method? In EmployeeTest class, Please execute those variables by the help of getters and setters method and print Employee info (Use necessary String to make the outcome meaningful, you can also use \n if you want). Paste the GitHub link below.
 */
public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;
	
	public String getName() {
		return name;
	}// We can access those variables by the getter and setter method
	// using---source--generate getters and setters--select all--generate.
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean getUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}