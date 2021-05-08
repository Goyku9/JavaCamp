package eCommerceMemberSystemDemo.core.abstracts;

import eCommerceMemberSystemDemo.entities.concretes.Customer;

public interface InputVerificationService {
	
	boolean isValid(Customer customer);

}
