package hw9Abstraction;
/*
 * (Continue from above inside same package) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method. Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?
 */
public abstract class NursingSchool {
	public abstract void hygiene();

	public void caring() {
		System.out.println("she is the person who is taking care me most");

		// created constructor
		/*
		 * public University() {
		 * 
		 * }
		 */// we can't implement or declare constructor inside interface.
	}
}
