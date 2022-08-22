package hw9Encapsulation;

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