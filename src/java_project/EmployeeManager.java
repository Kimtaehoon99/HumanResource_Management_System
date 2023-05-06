package java_project;

import java.util.ArrayList;
import java.util.Scanner;

import employee.AccountingDepartmentEmployee;
import employee.Employee;
import employee.EmployeeKind;
import employee.HumanResourcesDepartmentEmployee;
import employee.MarketingDepartmentEmployee;
import employee.PlanningDepartmentEmployee;
import employee.SalesDepartmentEmployee;


public class EmployeeManager {

	ArrayList<Employee> employees = new ArrayList<Employee>();	
	Scanner input;
	EmployeeManager(Scanner input){
		this.input = input;
	}


	public void addEmployee() {
		int kind = 0;
		Employee employee;
		while(kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.println("1 for SalesDevelopement");
			System.out.println("2 for PlanningDepartment");
			System.out.println("3 for HumanResourcesDepartment");
			System.out.println("4 for AccountingDepartment");
			System.out.println("5 for MarketingDepartment");
			System.out.println("Select Employee Kind between 1 and 5");
			kind = input.nextInt();
			if (kind == 1) {
				employee = new SalesDepartmentEmployee(EmployeeKind.SalesDepartment);
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else if (kind == 2) {
				employee = new PlanningDepartmentEmployee(EmployeeKind.PlanningDepartment);
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else if (kind == 3) {
				employee = new HumanResourcesDepartmentEmployee(EmployeeKind.HumanResourcesDepartment);
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else if (kind == 4) {
				employee = new AccountingDepartmentEmployee(EmployeeKind.AccountingDepartment);
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else if (kind == 5) {
				employee = new MarketingDepartmentEmployee(EmployeeKind.MarketingDepartment);
				employee.getUserInput(input);
				employees.add(employee);
				break;
			}
			else {
				System.out.println("Select Employee Kind between 1 and 5");
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
		System.out.println("# of registered employees:" + employees.size());
		for(int i = 0; i < employees.size(); i++){
			employees.get(i).printinfo();
		}
	}

}