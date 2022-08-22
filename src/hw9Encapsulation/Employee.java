package hw9Encapsulation;

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