package employee;

import java.util.Scanner;

import exception.EmailFormatException;

public interface EmployeeInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEmail();
	
	public void setEmail(String Email) throws EmailFormatException;
	
	public String getPhoneNumber();
	
	public void setPhoneNumber(String phoneNumber);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setEmployeeID( Scanner input);
	
	public void setEmployeeName( Scanner input);
	
	public void setEmployeeEmail( Scanner input);
	
	public void setEmployeePhoneNumber(Scanner input);
	
	
	
}
