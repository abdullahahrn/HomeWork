package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements Aeronuticalschool {
	public void maths() {
		System.out.println("this is non abstract mathod");
	}

	@Override
	public void mechanicalLab() {
		System.out.println();
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println();
	}
}
