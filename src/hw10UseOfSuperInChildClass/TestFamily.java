package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		// default Constructor initialized
		Daughter daughter = new Daughter();
		System.out.println("\n------------------------------\n");
		Daughter daughter1 = new Daughter("december", 12);
		System.out.println("\n--------------------------\n");
		daughter1.daughter();
		System.out.println("\n-------------------------\n");
		daughter.daughterInfo("december", 12);
		System.out.println("\n-----------------------------\n");
		Father father = new Father();
		System.out.println("\n-----------------------------\n");
		Father father1 = new Father("shab", 62, 'M', false);
		System.out.println("\n-----------------------------\n");
		father1.father();
		System.out.println("\n-------------------------\n");
		father1.fatherInfo("shab", 62, 'M', false);
	}
}