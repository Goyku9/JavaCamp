package eCommerceMemberSystemDemo.core.concretes;

import eCommerceMemberSystemDemo.core.abstracts.ValidationService;

public class ValidationServiceManager implements ValidationService{

	@Override
	public void sendVerificationMail() {
		
		System.out.println("Do�rulama Maili G�nderildi.");
	}

}
