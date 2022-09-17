package hw10UseOfSuperInChildClass;
//declare variable
public class Father {
	public String name;
	public int age;
	public char sex; //
	public boolean usCitizen;
	public String familyName;
	// Declare default constructor
	public Father() {
		System.out.println("this defult constructor from father class");
	}
	//parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father name : " + name + ",\nFather age : " + age + ",\nFather sex " + sex + ",\nusCitizen : " + usCitizen);
	}
	//method implemented,
	public void father() {
		System.out.println("This void typ mothod from father class");
	}
	//parameterized constructor fatherInfo
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father name : " + name + ",\n Father age : " + age + ",\n Father sex " + sex + ",\nusCitizen : " + usCitizen);
	}
}