package hw5Q3Constructor;

public class Student {

	public String stName;
	public byte stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// default constructor declared.
	public Student() {
		System.out.println("This default constructor is form Student Class.\n");

	}

	// Parameterized Constructor declared

	public Student(String stName, byte stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("Student Name: " + stName + ", ID: " + stID + ", sex: " + sex + "+ grade: " + grade
				+ ", Java Programmer Ans: " + isProgrammer);

	}

}
