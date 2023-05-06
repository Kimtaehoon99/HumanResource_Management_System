package employee;

import java.util.Scanner;

public class MarketingDepartmentEmployee extends Employee {
	//Employee 클래스를 상속하였으며 추가 필드를 가진다.
	protected int marketingCampaigns; 			//해당 직원이 참여한 마케팅 캠페인 수 (정수)
	protected int socialMediaFollowers; 		//해당 직원이 관리하는 소셜 미디어 팔로워 수 (정수)
	
	//Employee 클래스를 상속하였으며 추가 메소드를 가진다.
	public MarketingDepartmentEmployee(EmployeeKind kind) {
		this.kind = kind;
	}
	
	public int getMarketingCampaigns() {
		return marketingCampaigns;
	}

	public void setMarketingCampaigns (int marketingCampaigns) {
		this.marketingCampaigns = marketingCampaigns;
	}
	
	public int getSocialMediaFollowers() {
		return socialMediaFollowers;
	}

	public void setSocialMediaFollowers(int socialMediaFollowers) {
		this.socialMediaFollowers = socialMediaFollowers;
	}
	
	//Employee 클래스를 상속하였으며 메소드 오버라이딩하여 MarketingDepartmentEmployee클래스에 적합한 메소드를 가진다.
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
		
		System.out.print("marketingCampaigns: ");
		int marketingCampaigns = input.nextInt();
		this.setMarketingCampaigns(marketingCampaigns);
		
		System.out.print("socialMediaFollowers: ");
		int socialMediaFollowers = input.nextInt();
		this.setSocialMediaFollowers(socialMediaFollowers);
		
	}
	
	public void printinfo() {
		
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
		System.out.println("kind: " + skind + "name: "+ name + " id: " + id + " email: " + email + " phoneNumber: " + phoneNumber + "marketingCampaigns: " + marketingCampaigns + "socialMediaFollowers: " + socialMediaFollowers);
	}
}
