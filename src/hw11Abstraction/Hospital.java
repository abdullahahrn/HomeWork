package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public abstract void surgeryRomm();
	public void cafeteria();
	//default method
	default void morgue() {	
	}
	// static method
	public static void pharmacy() {	
	}
}

