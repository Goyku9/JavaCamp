package eCommerceMemberSystemDemo.core.concretes;

import java.util.regex.Pattern;

import eCommerceMemberSystemDemo.core.abstracts.InputVerificationService;
import eCommerceMemberSystemDemo.entities.concretes.Customer;

public class InputVerificationServiceManager implements InputVerificationService {
	
	
	public boolean isValidEmail(String email) {
		
		  String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
	                "[a-zA-Z0-9_+&*-]+)*@" +
	                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		
		if(email==null) {
			return false;
		}		
		return pat.matcher(email).matches();
	}
	
	public boolean isValidPassword(String password) {
		
		if(password == null || password.length() < 6) {
			return false;
		}
		return true;
		
	}
	
	public boolean isValidString(String name) {
		
		if(name == null || name.length() < 2) {
			return false;
		}
		 for(char c : name.toCharArray()) {
			 
			 if(Character.isDigit(c)) {
				 return false;
			 }
		 }
		 return true;
	}
	

	@Override
	public boolean isValid(Customer customer) {
		
		if(!isValidEmail(customer.geteMail())) {
	    System.out.println("not a valid email");
		return false;
	}
		if(!isValidString(customer.getFirstName())) {
			System.out.println(" sayý içeren ve iki karakterden az girilen isimler geçersizdir.");
		return false;
		}
		
		if(!isValidString(customer.getLastName())) {
			System.out.println(" sayý içeren ve iki karakterden az girilen isimler geçersizdir.");
		return false;
		}
		
		if(!isValidPassword(customer.getPassword())) {
			System.out.println("6 karakterden az girilen þifreler geçersizdir.");
		}
		
		
		return true;
	}

}
