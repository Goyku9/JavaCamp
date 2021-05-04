import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(1,"oyku","yuksel",LocalDate.of(1997, 1, 31),"1122334455");
		Customer customer2 = new Customer(2,"ilkay","yuksel",LocalDate.of(1993, 9,27 ),"2233445566");
	   
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);
		starbucksCustomerManager.save(customer2);
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer1);
		neroCustomerManager.save(customer2);
		
	
	}
	
	
	

}