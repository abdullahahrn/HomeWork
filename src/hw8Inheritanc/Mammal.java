package hw8Inheritanc;
//bulldog extends Animal- single inheritance
//bulldog extends dog, dog extends mammal, mammal extends animal is called multilevel inheritance.
//mammal extends animal, reptile extends animal, birds extends animal is called Hierarchical Inheritance
//Here animal is parent class and mammal is child class
public class Mammal extends Animal {
	public void mammalInfo() {
		System.out.println("This method is from Mammal Class");
	}
}