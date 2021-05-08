package eCommerceMemberSystemDemo.business.abstracts;

import eCommerceMemberSystemDemo.entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	void login(String eMail, String password);

}
