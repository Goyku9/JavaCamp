package eCommerceMemberSystemDemo.business.concretes;

import eCommerceMemberSystemDemo.business.abstracts.CustomerService;
import eCommerceMemberSystemDemo.core.abstracts.InputVerificationService;
import eCommerceMemberSystemDemo.core.abstracts.ValidationService;
import eCommerceMemberSystemDemo.dataAccess.abstracts.CustomerDao;
import eCommerceMemberSystemDemo.entities.concretes.Customer;

public class CustomerServiceManager implements CustomerService{
	
	InputVerificationService ivf;
	ValidationService vs;
	CustomerDao cd;
	
  public CustomerServiceManager(InputVerificationService ivf, ValidationService vs, CustomerDao cd) {
	  
	  this.ivf = ivf;
	  this.vs = vs;
	  this.cd = cd;
  }

	@Override
	public void register(Customer customer) {
		
		if(!ivf.isValid(customer)) {
			
			System.out.println("Kullanýcý bilgileri geçersiz. Kayýt Ýþlemi Gerçekleþtirilemedi.");
		}
		else if(!cd.emailCheck(customer)) {
			 
			System.out.println(customer.geteMail() + " email adresi kullanýlýyor. Kayýt Ýþlemi Gerçekleþtirilemedi.");
		}
		else {
			
			cd.add(customer);
			vs.sendVerificationMail();
			
		}
		
		
		
	}

	@Override
	public void login(String eMail, String password) {
		
		if(cd.loginByCheck(eMail, password)) {
			
			System.out.println("Baþarýyla Giriþ Yaptýnýz.");
		}
		else {
		
			
			System.out.println("Kullanýcý Adý veya Parola Yanlýþ");
		}
		
		
	}
	

}
