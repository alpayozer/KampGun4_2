package kampGun4_2.Concrete;

import kampGun4_2.Abstract.BaseCustomerManager;
import kampGun4_2.Abstract.CustomerCheckService;
import kampGun4_2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(_customerCheckService.CheckPerson(customer)) {
			
			System.out.println("Save to dataBase Starbucks : " + customer.getFirstName());
			super.save(customer);
		}else {
			
			System.out.println("Don't save to dataBase Starbucks.Not is a valid person");
		}
		
		
		
	}

}
