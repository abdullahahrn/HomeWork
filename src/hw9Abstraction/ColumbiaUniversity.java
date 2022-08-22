package hw9Abstraction;
/*A regular class can inherit only one regular class or one abstract class by extends keyword .
 * A regular class cannot inherit an interface by extends keyword.
 * implements keyword is used to inherit interface in regular class.
 * a regular class can inherit more than one interface
 * a regular class cannot inherit a regular class or abstract class by implements keyword.
*/
public class ColumbiaUniversity extends MedicalSchool{

	/*public abstract void chemistry();-----Regular class Contains only
	 *  non abstract methods, doesn't contain abstract methods*/
	
	//public abstract chemistry(); -----we can't create abstract class inside the regular class.
		
	public void biology() { // non abstract method implemented.
		System.out.println("he is a chemistry student of ColumbiaUniversity");
	}
    // yes we can default constructor inside the regular class.
	// default constructor is created.
	// constructor name should be same name as class name.
	public ColumbiaUniversity() {
		System.out.println("This default constructor is form Employee Class");
		{

		}
	}
	public void anatomyLab() {	
	}
	public void hygiene() {	
	}
}