package employee;

import java.util.Scanner;

public class Employee {

	protected EmployeeKind kind;		//employee의 부서
	protected String name;				//employee의 이름
	protected int id;					//employee의 id
	protected String email;				//employee의 email
	protected String phoneNumber;		//employee의 phoneNumber

	public Employee() {					//employee클래스의 기본생성자
	}									

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}									//employee클래스의 생성자로 인자로 name, id를 받는다.

	public Employee(String name, int id, String email, String phoneNumber) {
		this.name = name;
		this.id = id;
		this.email = email;
	}									//employee클래스의 생성자로 인자로 name, id, email, phoneNumber을  받는다.

	
	public Employee(EmployeeKind kind, String name, int id, String email, String phoneNumber) {
		this.kind= kind;
		this.name = name;
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}									//employee클래스의 생성자로 인자로 kind, name, id, email, phoneNumber를 받는다.

	public EmployeeKind getKind() {
		return kind;					//EmployeeKind에 대한 정보를 얻는 메소드
	}
	
	public void setKind(EmployeeKind kind) {
		this.kind = kind;				//EmployeeKind에 대한 정보를 수정하는 메소드
	}

	public String getName() {		
		return name;					//Employee의 이름에 대한 정보를 얻는 메소드
	}									

	public void setName(String name) {
		this.name = name;				//Employee의 이름을 수정하는 메소드
	}

	public int getId() {
		return id;						//Employee의 id에 대한 정보를 얻는 메소드
	}

	public void setId(int id) {
		this.id = id;					//Employee의 id를 수정하는 메소드
	}

	public String getEmail() {
		return email;					//Employee의 email에 대한 정보를 얻는 메소드
	}

	public void setEmail(String email) {
		this.email = email;				//Employee의 email에 대한 정보를 수정하는 메소드
	}

	public String getPhoneNumber() {
		return phoneNumber;				//Employee의 phoneNumber에 대한 정보를 얻는 메소드
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;	//Employee의 phoneNumber에 대한 정보를 수정하는 메소드
	}
	
	public void printinfo() {			//Employee의 정보를 출력하는 메소드
		
		String skind = "none";
		
		switch(this.kind) {
		case SalesDepartment:
			skind = "Sale";
			break;
		case PlanningDepartment:
			skind = "Planning";
			break;
		case HumanResourcesDepartment:
			skind = "HumanResource";
			break;
		case AccountingDepartment:
			skind = "Accounting";
			break;	
		default:
			
		}
		System.out.println("kind" + skind + "name:"+ name + " id:" + id + " email:" + email + " phoneNumber" + phoneNumber);
	}

	public void getUserInput(Scanner input) {	//Employee의 정보를 입력하는 메소드
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
