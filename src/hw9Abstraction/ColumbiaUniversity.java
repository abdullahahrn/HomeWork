package hw9Abstraction;
/*
 * (Continue from above inside same package) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if any of them is not possible to create, simply comment out the method and explain why in the comment out inside this class only. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor in ColumbiaUniversity. If no, comment out the created constructor and answer why not? Create another regular Class NYUniversity, create  non-abstract method -- anthropology. Print something inside the non-abstract or implemented method.  Create another regular Class RockefellerUniversity, create  non-abstract method -- maths. Print something inside the non-abstract or implemented method.  
 */
public class ColumbiaUniversity {
	
	/*public abstract void chemistry();-----Regular class Contains only
	 *  non abstract methods, doesn't contain abstract methods*/
	
	public void biology() { // non abstract method implemented.
		System.out.println("he is a chemistry student of ColumbiaUniversity");
	}

	// default constructor is created.
	// constructor name should be same name as class name.
	public ColumbiaUniversity() {
		System.out.println("This default constructor is form Employee Class");
		{

		}

	}
}