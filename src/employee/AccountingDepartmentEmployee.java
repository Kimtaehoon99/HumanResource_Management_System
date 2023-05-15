package employee;

import java.util.Scanner;

public class AccountingDepartmentEmployee extends Employee implements EmployeeInput {
	//Employee 클래스를 상속하였으며 추가 필드를 가진다.
	protected int financialStatementsPrepared; 	// 해당 직원이 작성한 재무제표 수 (정수) 
	
	//Employee 클래스를 상속하였으며 추가 메소드를 가진다.
	public AccountingDepartmentEmployee(EmployeeKind kind) {
		this.kind = kind;
	}
	
	public int getFinancialStatementsPrepared() {
		return financialStatementsPrepared;
	}

	public void setFinancialStatementsPrepared (int financialStatementsPrepared) {
		this.financialStatementsPrepared = financialStatementsPrepared;
	}
	
	//Employee 클래스를 상속하였으며 메소드 오버라이딩하여 AccountingDepartmentEmployee클래스에 적합한 메소드를 가진다.
	public void getUserInput(Scanner input) {
		System.out.print("Employee Id:");
		int id = input.nextInt(); 
		this.setId(id);

		System.out.print("Employee name:");
		String name = input.next();
		this.setName(name);

		char answer = 'X';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you have an email adress? (Y/N):");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Employee Email:");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
		
		System.out.print("PhoneNumber: ");
		String phoneNumber = input.next();
		this.setPhoneNumber(phoneNumber);
		
		System.out.print("financialStatementsPrepared: ");
		int financialStatementsPrepared = input.nextInt();
		this.setFinancialStatementsPrepared(financialStatementsPrepared);
		
	}
	
	public void printInfo() {
		
		String skind = "none";
		
		switch(this.kind) {
		case SalesDepartment:
			skind = "Sale";
			break;
		case PlanningDepartment:
			skind = "Planning";
			break;
		case HumanResourcesDepartment:
			skind = "HumanResource";
			break;
		case AccountingDepartment:
			skind = "Accounting";
			break;	
		default:
			
		}
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "financialStatementsPrepared: " + financialStatementsPrepared);
	}
}
