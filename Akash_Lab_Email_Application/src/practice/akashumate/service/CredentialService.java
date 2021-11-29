package practice.akashumate.service;

import java.util.Random;

public class CredentialService {
	
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String SpecialChars = "!#$%^&*()_+'/?><";
		String combinedChars = capitalLetters+smallLetters+numbers+SpecialChars;
		
		Random random = new Random();
		
		char[] password = new char[8];
		for (int i=0; i<8; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password.toString();
	}
	
	public String generateEmail(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".xyz.com";
	}
	
	public void showCredentials(String firstName, String email, String password) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email: "+email);
		System.out.println("Passowrd: "+password);
	}		
}