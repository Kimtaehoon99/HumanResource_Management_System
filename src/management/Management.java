package management;

import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
		
		
		for(;;){
			
			System.out.println("Employee Management System");
			System.out.println("1. View Employee list");
			System.out.println("2. Add Employee");
			System.out.println("3. Manage Employee Salary");
			System.out.println("4. Update Employee Information");
			System.out.println("5. Exit");
			System.out.print("\n");
			System.out.print("Select options: ");
			
			Scanner input=new Scanner(System.in);
			
			int number=input.nextInt();
			
			switch(number) {
			case 1:
				System.out.println("List");
				System.out.println("1.Kim");
				System.out.println("2.Park");
				System.out.println("3.Lee");
				break;
			case 2:
				System.out.println("Add menu");
				break;
			case 3:
				System.out.println("Salary menu");
				break;
			case 4:
				System.out.println("Update menu");
				break;
			case 5:
				System.out.println("return 0");
				break;
			default: 
				System.out.println("Wrong option! Select options again!! ");
				System.out.println("\n");
				break;
			}
			if(number>=1 && number<=5)
				break;
		}
	}
}
