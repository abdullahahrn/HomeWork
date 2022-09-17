package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super("Abdullah Al Harun", 29, 'M', false);
		super.father();
		super.fatherInfo("Bashar", 55, 'M', false);
		super.familyName = "Harun";
		System.out.println("Father Family name is " + familyName);
		System.out.println("This default constractor is from daughter class");
	}

	public Daughter(String birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Birth Month" + birthMonth + "\nDaughter age " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("shab", 62, 'M', false);
		super.familyName = "uddin";
		System.out.println("father Family name is" + familyName);
		System.out.println("this void type method from daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Daughter Birth Month: " + birthMonth + ",\nDaughter age: " + age);
	}
}