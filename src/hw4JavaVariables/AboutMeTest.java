package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe myInfo = new AboutMe(); // Constructor Initialized
		myInfo.name = "Abdullah Al Harun";// Variables initialized
		myInfo.age = 29;
		myInfo.myApartmentRent = 2200;
		myInfo.myYearlySalary = 89000;
		myInfo.myBankBalance = 54645632197l;
		myInfo.myHeight = 5.10f;
		myInfo.myGrade = 3.8956124652;
		myInfo.sex = 'M';
		myInfo.usCitizen = false;
		myInfo.aboutMe();// method initialized
	
		System.out.println("\n----------------------------------");
		
		AboutMe myInfo1 = new AboutMe(); // Constructor Initialized
		myInfo1.name = "Alex";// Variables initialized
		myInfo1.age = 29;
		myInfo1.myApartmentRent = 2400;
		myInfo1.myYearlySalary = 45000;
		myInfo1.myBankBalance = 125744525l;
		myInfo1.myHeight = 5.08f;
		myInfo1.myGrade = 3.4956124652;
		myInfo1.sex = 'M';
		myInfo1.usCitizen = true;
		myInfo1.aboutMe();// method initialized
		
	}

}
