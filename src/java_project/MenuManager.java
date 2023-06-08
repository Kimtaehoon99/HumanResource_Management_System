package java_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EmployeeManager employeeManager = getObject("employeemanager.ser");
		if(employeeManager == null) {
			employeeManager = new EmployeeManager(input);
		}
		WindowFrame frame;
		
		frame = new WindowFrame(employeeManager); 
		
		
		selectMenu(input, employeeManager);
		putObject(employeeManager, "employeemanager.ser");

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
					logger.log("add a employee");
					break;
				case 2:
					employeeManager.deleteEmployee();
					logger.log("delete a employee");
					break;
				case 3:
					employeeManager.editEmployee();
					logger.log("edit a employee");
					break;
				case 4:
					employeeManager.viewEmployees();	
					logger.log("view a lost of a employee");
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

	public static EmployeeManager getObject(String filename) {
		EmployeeManager employeeManager= null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			employeeManager = (EmployeeManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return employeeManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return employeeManager;
	}
	
	public static void putObject(EmployeeManager employeeManager ,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


