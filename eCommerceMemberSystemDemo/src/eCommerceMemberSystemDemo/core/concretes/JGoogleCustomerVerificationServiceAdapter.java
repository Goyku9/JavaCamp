package eCommerceMemberSystemDemo.core.concretes;

import JGoogle.JGoogleCustomerVerification;
import eCommerceMemberSystemDemo.core.abstracts.InputVerificationService;
import eCommerceMemberSystemDemo.entities.concretes.Customer;

public class JGoogleCustomerVerificationServiceAdapter implements InputVerificationService{
	
	JGoogleCustomerVerification googleVerify;
	
	
	

	public JGoogleCustomerVerificationServiceAdapter(JGoogleCustomerVerification googleVerify) {
	
		this.googleVerify = googleVerify;
	}




	@Override
	public boolean isValid(Customer customer) {
		
		googleVerify.isValid();
		return true;
	}

}
