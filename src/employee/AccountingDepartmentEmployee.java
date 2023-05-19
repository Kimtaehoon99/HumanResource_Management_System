package employee;

import java.util.Scanner;

public class AccountingDepartmentEmployee extends Employee {
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
		setEmployeeID(input);
		setEmployeeName(input);		
		setEmployeeEmailwithYn(input);		
		setEmployeePhoneNumber(input);
		
		System.out.print("financialStatementsPrepared: ");
		int financialStatementsPrepared = input.nextInt();
		this.setFinancialStatementsPrepared(financialStatementsPrepared);
		
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "financialStatementsPrepared: " + financialStatementsPrepared);
	}
	

}
