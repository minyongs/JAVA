package exam_class_extends_check;

public class Employee {
private String name;
private String address;
private String phoneNumber;
private int salary;

public Employee() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public void setEmpData(String name,String address,String phoneNumber,int salary) {
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.salary = salary;
}


}


class Manager extends Employee{
	private int bonus;
	private String job;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}


