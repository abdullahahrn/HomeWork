package hw9Abstraction;

public interface College {
	public void CommonRoom();  // method declared.
	public void laboratory();
	public void languageClub();
	
	default void dorm() {  // default method created.
	}
	public static void studyRoom() {  // static method created.
	} 
}
