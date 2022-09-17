package hw11Abstraction;

//an abstract class can inherit only one abstract class or one regular class by extends keyWord
//An abstract class can't inherit an Interface by extends key word
//implements keyword is used to inherit Interface in abstract class
//an abstract class can inherit more than one Interface
//an abstract class cannot inherit a regular class or abstract class by implements keyword
//Three class can call possible in abstract class by using implements keyword.
public abstract class Medicalschool extends NursingSchool implements LawSchool{
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("this is non abstract method");
	}
	public Medicalschool() {	
	}	
}



