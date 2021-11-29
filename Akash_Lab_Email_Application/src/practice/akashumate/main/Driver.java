package practice.akashumate.main;

import practice.akashumate.model.Employee;
import practice.akashumate.service.CredentialService;
import practice.akashumate.utils.Constants;
import java.util.Scanner;


public class Driver {
	
	public static Employee employee = new Employee("akash", "umate");
	public static Constants constants = new Constants();
	public static Scanner sc= new Scanner(System.in); 
	public static CredentialService credentialservice = new CredentialService();

	public static void main(String[] args) {
		
		displayOption();	
		int userInput = sc.nextInt();
		String department = "";
		System.out.println("You Selected: "+userInput);
		
		switch(userInput){
			case 1: department = constants.TECHNICAL_DEPARTMENT;
				break;
			case 2: department = constants.ADMIN_DEPARTMENT;
				break;
			case 3: department = constants.HUMAN_RESOURCE_DEPARTMENT;
				break;
			case 4: department = constants.LEGAL_DEPARTMENT;
				break;
			default: System.out.println("Invalid Choice");
		}
		
		if(!department.isEmpty()) {
			String email = credentialservice.generateEmail(employee.getEmployeeFirstName(), employee.getEmployeeLastName(), department);
			String password = credentialservice.generatePassword();
			credentialservice.showCredentials(employee.getEmployeeFirstName(), email, password);
		}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
	}
	
	public static void displayOption() {
		System.out.println("Please enter the department from following list");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
}
