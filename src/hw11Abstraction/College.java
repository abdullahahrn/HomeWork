package hw11Abstraction;

public interface College {
	public void commonRoom();
	public abstract void laboratory();
	public void lanauageClub();

	default void dorm() {	
	}
	public static void studyRoom() {
	}	
}
