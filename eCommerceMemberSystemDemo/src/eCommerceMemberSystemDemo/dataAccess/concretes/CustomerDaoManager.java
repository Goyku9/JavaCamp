package eCommerceMemberSystemDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceMemberSystemDemo.dataAccess.abstracts.CustomerDao;
import eCommerceMemberSystemDemo.entities.concretes.Customer;

public class CustomerDaoManager implements CustomerDao {
	
	List<Customer> customers = new ArrayList<>();

	@Override
	public void add(Customer customer) {
		
		customers.add(customer);
		System.out.println(customer.getFirstName().toUpperCase() + " " + customer.getLastName().toUpperCase() + " sisteme kaydedildi." );
	}

	@Override
	public boolean emailCheck(Customer customer) {
		
		for(Customer c : customers) {
			if(c.geteMail() == customer.geteMail()) {
				return false;
		}
	}
		return true;
		
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		
		for(Customer c : customers) {
			if(c.geteMail() == email && c.getPassword() == password)
				return true;
		}
		return false;
	}

}
