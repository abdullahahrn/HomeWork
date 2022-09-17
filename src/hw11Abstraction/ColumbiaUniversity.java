package hw11Abstraction;

/*A regular class can inherit only one regular class or one abstract class by extends keyword
 *A regular class can't inherit an Interface by extends keyword
*implements keyword is used to inherit Interface in regular class.
 *a regular class can inherit more than one Interface
 *a regular class cannot inherit a regular class or abstract class by implements keyword*/
public class ColumbiaUniversity extends Medicalschool implements University,Vocationalschool {
	public void biology() {
		System.out.println("this is non abstract method");
	}
	public ColumbiaUniversity() {

		// Default methods are allowed only in interfaces, not in regular class
	}
	@Override
	public void commonRoom() {


	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}
	public void columbiaUniverstiyInfo() {
		// TODO Auto-generated method stub

	}
	@Override
	public void lanauageClub() {
		// TODO Auto-generated method stub

	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}
	@Override
	public void surgeryRomm() {
		// TODO Auto-generated method stub

	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}
	@Override
	public void lawInfo1() {
		// TODO Auto-generated method stub

	}
	@Override
	public void voactionalInfo() {
		// TODO Auto-generated method stub

	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}