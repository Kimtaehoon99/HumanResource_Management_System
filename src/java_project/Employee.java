package java_project;

public class Employee {

	String name;
	int id;
	String email;
	String phoneNumber;
	static int numEmployeeRegistered;

	public Employee() {
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
		numEmployeeRegistered++;
	}

	public Employee(String name, int id, String email, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void printinfo() {
		System.out.println("name:"+ name + " id:" + id + " email:" + email + " phoneNumber" + phoneNumber);
	}

}
