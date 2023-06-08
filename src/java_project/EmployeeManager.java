package java_project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import employee.AccountingDepartmentEmployee;
import employee.Employee;
import employee.EmployeeInput;
import employee.EmployeeKind;
import employee.HumanResourcesDepartmentEmployee;
import employee.MarketingDepartmentEmployee;
import employee.PlanningDepartmentEmployee;
import employee.SalesDepartmentEmployee;


public class EmployeeManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1244149871863351172L;
	
	ArrayList<EmployeeInput> employees = new ArrayList<EmployeeInput>();	
	transient Scanner input;
	EmployeeManager(Scanner input){
		this.input = input;
	}


	public void addEmployee() {
		int kind = 0;
		EmployeeInput employeeInput;
		while(kind < 1 || kind > 5) {
			try {
				System.out.println("1 for SalesDevelopement");
				System.out.println("2 for PlanningDepartment");
				System.out.println("3 for HumanResourcesDepartment");
				System.out.println("4 for AccountingDepartment");
				System.out.println("5 for MarketingDepartment");
				System.out.println("Select Employee Kind between 1 and 5");
				kind = input.nextInt();
				if (kind == 1) {
					employeeInput = new SalesDepartmentEmployee(EmployeeKind.SalesDepartment);
					employeeInput.getUserInput(input);
					employees.add(employeeInput);
					break;
				}
				else if (kind == 2) {
					employeeInput = new PlanningDepartmentEmployee(EmployeeKind.PlanningDepartment);
					employeeInput.getUserInput(input);
					employees.add(employeeInput);
					break;
				}
				else if (kind == 3) {
					employeeInput = new HumanResourcesDepartmentEmployee(EmployeeKind.HumanResourcesDepartment);
					employeeInput.getUserInput(input);
					employees.add(employeeInput);
					break;
				}
				else if (kind == 4) {
					employeeInput = new AccountingDepartmentEmployee(EmployeeKind.AccountingDepartment);
					employeeInput.getUserInput(input);
					employees.add(employeeInput);
					break;
				}
				else if (kind == 5) {
					employeeInput = new MarketingDepartmentEmployee(EmployeeKind.MarketingDepartment);
					employeeInput.getUserInput(input);
					employees.add(employeeInput);
					break;
				}
				else {
					System.out.println("Select Employee Kind between 1 and 5");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}

	public void deleteEmployee() {
		System.out.print("Employee ID:");
		int employeeId = input.nextInt();
		int index = findIndex(employeeId);
		removefromEmployees(index,employeeId);
	}

	public int findIndex(int employeeId) {
		int index = -1;
		for(int i = 0; i<employees.size(); i++) {
			if (employees.get(i).getId()  == employeeId) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromEmployees(int index,int employeeId) {
		if(index >= 0) {
			employees.remove(index);
			System.out.println("the employee" + employeeId + " is deleted");
			return 1;
		}
		else {
			System.out.println("the employee has not been registered");
			return -1;
		}
	}

	public void editEmployee() {
		System.out.print("Employee ID:");
		int employeeId = input.nextInt();
		for(int i =0; i<employees.size(); i++) {
			EmployeeInput employee = employees.get(i);
			if(employee.getId() == employeeId) {
				int num = -1;
				while( num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						employee.setEmployeeID(input);
						break;
					case 2:
						employee.setEmployeeName(input);
						break;
					case 3:
						employee.setEmployeeEmail(input);
						break;
					case 4:
						employee.setEmployeePhoneNumber(input);
						break;
					default:
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
			employees.get(i).printInfo();
		}
	}
	
	public int size() {
		return employees.size();
	}

	public EmployeeInput get(int index) {
		return (Employee) employees.get(index);
	}


	public void showEditMenu() {
		System.out.println("** Employee Info Edit Menu **");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Email");
		System.out.println("4, view phone");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-6:");
	}
}