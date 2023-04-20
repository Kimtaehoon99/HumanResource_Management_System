package java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {

	ArrayList<Employee> employees = new ArrayList<Employee>();	
	Scanner input;
	EmployeeManager(Scanner input){
		this.input = input;
	}


	public void addEmployee() {
		Employee employee = new Employee();
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		employee.name = input.next();
		System.out.print("Employee Id:");
		employee.id = input.nextInt();
		System.out.print("PhoneNumber:");
		employee.phoneNumber = input.next();
		System.out.print("Employee Email:");
		employee.email = input.next();
		employees.add(employee);
	}

	public void deleteEmployee() {
		System.out.print("Employee ID:");
		int employeeId = input.nextInt();
		int index = -1;
		for(int i = 0; i<employees.size(); i++) {
			if (employees.get(i).id  == employeeId) {
				index = i;
				break;
			}
		}

		if(index >= 0) {
			employees.remove(index);
			Employee.numEmployeeRegistered--;
			System.out.println("the employee" + employeeId + " is deleted");
		}
		else {
			System.out.println("the employee has not been registered");
			return;
		}
	}
	public void editEmployee() {
		System.out.print("Employee ID:");
		int employeeId = input.nextInt();
		for(int i =0; i<employees.size(); i++) {
			Employee employee = employees.get(i);
			if(employee.id == employeeId) {
				int num = -1;
				while( num != 5) {
					System.out.println("** Student Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4, view phone");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-6:");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Employee ID:");
						employee.id = input.nextInt(); 
					}
					else if(num == 2) {
						System.out.print("Employee name:");
						employee.email = input.next();
					}
					else if (num == 3) {
						System.out.print("Email address:");
						employee.email = input.next();
					}
					else if (num == 4) {
						System.out.print("Phnoe number:");
						employee.phoneNumber = input.next();
					}
					else {
						continue;
					}
				}
				break;
			}
		}

	}
	public void viewEmployees() {
		for(int i = 0; i < employees.size(); i++) {
			employees.get(i).printinfo();
		}
	}

}