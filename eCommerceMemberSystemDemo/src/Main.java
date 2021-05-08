import JGoogle.JGoogleCustomerVerification;
import eCommerceMemberSystemDemo.business.abstracts.CustomerService;
import eCommerceMemberSystemDemo.business.concretes.CustomerServiceManager;
import eCommerceMemberSystemDemo.core.concretes.InputVerificationServiceManager;
import eCommerceMemberSystemDemo.core.concretes.JGoogleCustomerVerificationServiceAdapter;
import eCommerceMemberSystemDemo.core.concretes.ValidationServiceManager;
import eCommerceMemberSystemDemo.dataAccess.concretes.CustomerDaoManager;
import eCommerceMemberSystemDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
	
		Customer customer1 = new Customer("engin","demiroð","demirog@gmailcom","64756488898");
		Customer customer2 = new Customer("öykü","yüksel","oykue9@icloud.com","999999");
		Customer customer3 = new Customer("ilkay27","yüksel","ilkay27@icloud.com","272727272727");
		Customer customer4 = new Customer("alp","zeyli","alp9@icloud.com","666");
		
		
		CustomerService customerService = new CustomerServiceManager(new InputVerificationServiceManager(),new ValidationServiceManager(), new CustomerDaoManager());

		customerService.register(customer1);
		
		System.out.println("**************************************************");
		
		customerService.register(customer2);
		
		System.out.println("**************************************************");
		
		customerService.register(customer3);
		
		System.out.println("**************************************************");
		
		customerService.register(customer2);
		
		CustomerService customerService2 = new CustomerServiceManager(new JGoogleCustomerVerificationServiceAdapter(new JGoogleCustomerVerification()),new ValidationServiceManager(), new CustomerDaoManager());
		
		customerService2.register(customer4);
		
		System.out.println("**************************************************");
		
		
		customerService.login("oykue9@icloud.com","999999");
		
		
		customerService.login("ilkay27@icloud.com","272727272727");
		
		customerService2.login("demirog@gmailcom","64756488898");
		
		
		
		
		
	}

}
