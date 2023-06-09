package employee;

import java.util.Scanner;
	
public class PlanningDepartmentEmployee extends Employee{
	//Employee 클래스를 상속하였으며 추가 필드를 가진다.
	protected int projectCount; 		//해당 직원이 관리하는 프로젝트 수 (정수)
	protected int projectBudget; 		//해당 직원이 책임지는 프로젝트 예산 (정수)
	
	//Employee 클래스를 상속하였으며 추가 메소드를 가진다.
	public PlanningDepartmentEmployee(EmployeeKind kind) {
	this.kind = kind;
	}
	
	public int getProjectCount() {
		return projectCount;
	}

	public void setProjectCount(int recruitmentCount) {
		this.projectCount = recruitmentCount;
	}
	
	public int getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(int projectBudget) {
		this.projectBudget = projectBudget;
	}
	
	//Employee 클래스를 상속하였으며 메소드 오버라이딩하여 planningDepartmentEmployee클래스에 적합한 메소드를 가진다.
	public void getUserInput(Scanner input) {
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeEmailwithYn(input);	
		setEmployeePhoneNumber(input);
		
		System.out.print("ProjectCount:");
		int projectCount = input.nextInt();
		this.setProjectCount( projectCount);
		
		System.out.print("ProjectBudget:");
		int projectBudget = input.nextInt();
		this.setProjectBudget(projectBudget);
		
	}
	
	public void printInfo() {
		
		String skind = getKindString();
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "projectCount: " + projectCount + "projectBudjet: " + projectBudget);
	}
		
}
