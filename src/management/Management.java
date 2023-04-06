package management;

import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = 6;
		
		for(;;){
			
			System.out.println("***Employee Management System***");
			System.out.println("1. View Employee list");
			System.out.println("2. Add Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Manage Employee Salary");
			System.out.println("5. Update Employee Information");
			System.out.println("6. Exit");
			System.out.print("\n");
			System.out.print("Select options: ");
			
			number = input.nextInt();
			switch(number) {
			case 1: {
				System.out.println("<View list>");
				viewList();
				break;
			}
			case 2: {
				System.out.println("<Add menu>");
				addEmployee();
				break;
			}
			case 3: {
				System.out.println("<Delete menu>");
				deleteEmployee();
				break;
			}
			case 4: {
				System.out.println("<Salary menu>");
			}
				break;
			case 5: {
				System.out.println("<Update menu>");
				updateEmployee();
				break;
			}
			case 6:
				return;
			default: 
				System.out.println("Wrong option! Select options again!! ");
				System.out.println("\n");
				break;
			}
			System.out.println("\n");		
		}
	}
	
	public static void viewList() {
		System.out.println("1.Kim");
		System.out.println("2.Park");
		System.out.println("3.Lee");
	}
	
	
	public static void addEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		String employeeName = input.next();
		System.out.print("Employee rank:");
		String employeeRank = input.next();
		System.out.print("PhoneNumber:");
		int PhoneNumber = input.nextInt();
		System.out.print("Employee Email:");
		String employeeEmail = input.next();
	}
	public static void deleteEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		String employeeName = input.next();
		
	}
	public static void salaryMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		String employeeName = input.next();
		
	}
	public static void updateEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.print("Employee name:");
		String employeeName = input.next();
		
	}
}
