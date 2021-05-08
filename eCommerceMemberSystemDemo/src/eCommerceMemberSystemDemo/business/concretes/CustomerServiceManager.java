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
			
			System.out.println("Kullan�c� bilgileri ge�ersiz. Kay�t ��lemi Ger�ekle�tirilemedi.");
		}
		else if(!cd.emailCheck(customer)) {
			 
			System.out.println(customer.geteMail() + " email adresi kullan�l�yor. Kay�t ��lemi Ger�ekle�tirilemedi.");
		}
		else {
			
			cd.add(customer);
			vs.sendVerificationMail();
			
		}
		
		
		
	}

	@Override
	public void login(String eMail, String password) {
		
		if(cd.loginByCheck(eMail, password)) {
			
			System.out.println("Ba�ar�yla Giri� Yapt�n�z.");
		}
		else {
		
			
			System.out.println("Kullan�c� Ad� veya Parola Yanl��");
		}
		
		
	}
	

}
