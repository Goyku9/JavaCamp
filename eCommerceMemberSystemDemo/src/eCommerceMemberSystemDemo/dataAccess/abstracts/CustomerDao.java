package eCommerceMemberSystemDemo.dataAccess.abstracts;



import eCommerceMemberSystemDemo.entities.concretes.Customer;

public interface CustomerDao {
	
	void add(Customer customer);
	boolean emailCheck(Customer customer);
	boolean loginByCheck(String email, String password);
	

}
