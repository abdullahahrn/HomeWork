package hw9Abstraction;

public interface Hospital {
	public void emergencyRoom();  // method declared.
	public void surgeryRoom();
	public void cafeteria();
	
	default void morgue() {   // default method created.
	}
	public static void  hospital() {  // static method created.
	}
}
