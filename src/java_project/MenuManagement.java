package java_project;

import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EmployeeManager employeeManager = new EmployeeManager(input);
		int num = -1;
		while(num != 5) {
			System.out.println("***Employee Management System***");
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Edit Employee");
			System.out.println("4. View Employee");
			System.out.println("5. Exit");
			System.out.print("Select options between 1-5: ");
			num = input.nextInt();
			if(num==1) {
				employeeManager.addEmployee();
			}
			else if(num == 2) {
				employeeManager.deleteEmployee();
			}
			else if(num == 3) {
				employeeManager.editEmployee();
			}
			else if(num == 4) {
				employeeManager.viewEmployees();			
			}
			else {
				continue;
			}	
		}
	}
}


