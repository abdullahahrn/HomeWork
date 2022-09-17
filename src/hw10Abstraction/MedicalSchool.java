package hw10Abstraction;
/*
* One keywords are used for the inheritance in Abstract class.
* An Abstract class can inherit only one abstract class.
* An Abstract class cannot inherit regular class.
*/
public abstract class MedicalSchool extends NursingSchool{
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("he is a medical student");
	}
}
