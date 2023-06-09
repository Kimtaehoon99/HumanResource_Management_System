package employee;

import java.util.Scanner;

public class HumanResourcesDepartmentEmployee extends Employee {
	//Employee 클래스를 상속하였으며 추가 필드를 가진다.
	protected int recruitmentCount;				// 해당 직원이 채용에 참여한 인원 수 (정수)
	protected int trainingProgramsDeveloped; 	//해당 직원이 개발한 교육 프로그램 수 (정수)
	
	//Employee 클래스를 상속하였으며 추가 메소드를 가진다.
	public HumanResourcesDepartmentEmployee(EmployeeKind kind) {
		this.kind = kind;
	}
	
	public int getRecruitmentCount() {
		return recruitmentCount;
	}

	public void setRecruitmentCount(int recruitmentCount) {
		this.recruitmentCount = recruitmentCount;
	}
	
	public int getTrainingProgramsDeveloped() {
		return recruitmentCount;
	}

	public void setTrainingProgramsDeveloped(int trainingProgramsDeveloped) {
		this.trainingProgramsDeveloped = trainingProgramsDeveloped;
	}
	
	//Employee 클래스를 상속하였으며 메소드 오버라이딩하여 HumanResourcesDepartmentEmployee클래스에 적합한 메소드를 가진다.
	public void getUserInput(Scanner input) {
		setEmployeeID(input);
		setEmployeeName(input);
		setEmployeeEmailwithYn(input);
		setEmployeePhoneNumber(input);
		
		System.out.print("recruitmentCount:");
		int recruitmentCount = input.nextInt();
		this.setRecruitmentCount(recruitmentCount);
		
		System.out.print("TrainingProgramsDeveloped:");
		int trainingProgramsDeveloped = input.nextInt();
		this.setTrainingProgramsDeveloped(trainingProgramsDeveloped);
		
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "recruitmentCount: " + recruitmentCount + "trainingProgramsDeveloped: " + trainingProgramsDeveloped);
	}
}
