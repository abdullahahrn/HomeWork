package hw9Encapsulation;
/*Create a package name "hw9Encapsulation" in the HW project. Inside the package, a) Create a class, Employee and declare some private variables----> name, age, sex, usCitizen. How can you access those variables by the getter and setter method? In EmployeeTest class, Please execute those variables by the help of getters and setters method and print Employee info (Use necessary String to make the outcome meaningful, you can also use \n if you want). Paste the GitHub link below.
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Abdullah Al Harun");
		employee.setAge(29);
		employee.setSex('M');
		employee.setUsCitizen(false);	
		System.out.println("Employee info: " + employee.getName() + ", \nAge: " + employee.getAge() + ", \nSex " + employee.getSex() + ", \nUsCitizen: " + employee.getUsCitizen());
		
	}
}