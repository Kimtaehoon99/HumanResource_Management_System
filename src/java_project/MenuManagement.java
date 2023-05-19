package java_project;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuManagement {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		EmployeeManager employeeManager = new EmployeeManager(input);

		selectMenu(input, employeeManager);

	}

	public static void selectMenu(Scanner input, EmployeeManager employeeManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();

				switch(num) {
				case 1:
					employeeManager.addEmployee();
					break;
				case 2:
					employeeManager.deleteEmployee();
					break;
				case 3:
					employeeManager.editEmployee();
					break;
				case 4:
					employeeManager.viewEmployees();	
					break;	
				default:
					continue; 
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			//	System.exit(-1);
			}
		}
	}

	public static void showMenu() {
		System.out.println("***Employee Management System***");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Edit Employee");
		System.out.println("4. View Employee");
		System.out.println("5. Exit");
		System.out.print("Select options between 1-5: ");
	}
}


