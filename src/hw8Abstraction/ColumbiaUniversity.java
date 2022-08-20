package hw8Abstraction;

public class ColumbiaUniversity {
	
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
}