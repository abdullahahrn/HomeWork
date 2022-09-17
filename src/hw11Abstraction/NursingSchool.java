package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{
	public abstract void hygiene();
	public void caring() {
		System.out.println("This non-abstract method from NursingSchool Class");
	}
}
