package example;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee empt = new Employee();
		Employee empt2 = new Employee();
		empt.employeeData("홍길동","010 -4161-3724",1000000);
		empt2.employeeData("송희동","010 -7777-7777",1000000);
		
		
		
		empt.printData();
		empt2.printData();
		
		
		
	}
	

}
