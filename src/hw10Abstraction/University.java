package hw10Abstraction;
/*one keywords are used for the inheritance in Interface.
* An interface can inherit more than one Interfaces.
* An interface cannot inherit regular class or abstract class
*/
public interface University extends College,Hospital{	
	public void classSize();// method declared.
	public void playGround();
	public void teacher();
	
	default void gymnasium() {  // default method created.
	}
	public static void library() {  // static method created.
	}
}