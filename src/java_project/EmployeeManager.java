package java_project;

import java.util.ArrayList;
import java.util.Scanner;

import employee.Employee;
import employee.PlanningDepartmentEmployee;


public class EmployeeManager {

	ArrayList<Employee> employees = new ArrayList<Employee>();	
	Scanner input;
	EmployeeManager(Scanner input){
		this.input = input;
	}


	public void addEmployee() {
		int kind = 0;
		Employee employee;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for SalesDevelopement");
			System.out.println("2 for PlanningDepartment");
			System.out.println("Select Employee Kind between 1 and 2");
			kind = input.nextInt();
			if (kind == 1) {
				employee = new Employee();
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else if (kind == 2) {
				employee = new PlanningDepartmentEmployee();
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else {
				System.out.println("Select Employee Kind between 1 and 2");
			}
		}

	}

	public void deleteEmployee() {
		System.out.print("Employee ID:");
		int employeeId = input.nextInt();
		int index = -1;
		for(int i = 0; i<employees.size(); i++) {
			if (employees.get(i).getId()  == employeeId) {
				index = i;
				break;
			}
		}

		if(index >= 0) {
			employees.remove(index);
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
			if(employee.getId() == employeeId) {
				int num = -1;
				while( num != 5) {
					System.out.println("** Employee Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Email");
					System.out.println("4, view phone");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-6:");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Employee ID:");
						int id = input.nextInt(); 
						employee.setId(id);
					}
					else if(num == 2) {
						System.out.print("Employee name:");
						String name = input.next();
						employee.setName(name);
					}
					else if (num == 3) {
						System.out.print("Email address:");
						String email = input.next();
						employee.setEmail(email);
					}
					else if (num == 4) {
						System.out.print("Phnoe number:");
						String phoneNumber = input.next();
						employee.setPhoneNumber(phoneNumber);
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
		System.out.println("# of registered students:" + employees.size());
		for(int i = 0; i < employees.size(); i++){
			employees.get(i).printinfo();
		}
	}

}