package employee;

import java.util.Scanner;

public class Employee {

	protected EmployeeKind kind = EmployeeKind.SalesDepartment;
	protected String name;
	protected int id;
	protected String email;
	protected String phoneNumber;

	public Employee() {
	}
	
	public EmployeeKind getKind() {
		return kind;
	}

	public void setKind(EmployeeKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, String email, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public void printinfo() {
		System.out.println("name:"+ name + " id:" + id + " email:" + email + " phoneNumber" + phoneNumber);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Employee Id:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Employee name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Employee Email:");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("PhoneNumber:");
		String phoneNumber = input.next();
		this.setPhoneNumber(phoneNumber);
		
	}
}
