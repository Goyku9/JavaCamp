package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    
    @Override
    public void save(Customer customer) {
        
        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        }else {
            try {
                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
    }
}