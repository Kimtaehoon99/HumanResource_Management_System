package employee;

import java.util.Scanner;

public class SalesDepartmentEmployee extends Employee implements EmployeeInput {
	//Employee 클래스를 상속하였으며 추가 필드를 가진다.
	protected int monthlySales; 			//해당 직원의 월간 판매 실적 (정수)
	protected double customerSatisfactionRate; //해당 직원의 담당 고객 만족도 (실수)
	
	//Employee 클래스를 상속하였으며 추가 메소드를 가진다.
	public SalesDepartmentEmployee(EmployeeKind kind) {
		this.kind = kind;
	}
	
	public int getMonthlySales() {
		return monthlySales;
	}

	public void setMonthlySales(int monthlySales) {
		this.monthlySales = monthlySales;
	}
	
	public double getCustomerSatisfactionRate() {
		return customerSatisfactionRate;
	}

	public void setCustomerSatisfactionRate(double customerSatisfactionRate) {
		this.customerSatisfactionRate = customerSatisfactionRate;
	}
	
	//Employee 클래스를 상속하였으며 메소드 오버라이딩하여 SalesDepartmentEmployee클래스에 적합한 메소드를 가진다.
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
		
		System.out.print("PhoneNumber:");
		String phoneNumber = input.next();
		this.setPhoneNumber(phoneNumber);
		
		System.out.print("monthlySales:");
		int monthlySales = input.nextInt();
		this.setMonthlySales(monthlySales);
		
		System.out.print("customerSatisfactionRate:");
		int customerSatisfactionRate = input.nextInt();
		this.setCustomerSatisfactionRate(customerSatisfactionRate);
		
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
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "monthlySales: " + monthlySales + "customerSatisfactionRate: " + customerSatisfactionRate);
	}
}
