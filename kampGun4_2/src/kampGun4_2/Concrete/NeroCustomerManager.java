package kampGun4_2.Concrete;

import kampGun4_2.Abstract.BaseCustomerManager;
import kampGun4_2.Abstract.CustomerCheckService;
import kampGun4_2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this._customerCheckService = customerCheckService;
		
	}
	@Override
	public void save(Customer customer) {
		
		if(_customerCheckService.CheckPerson(customer)) {
			
			System.out.println("Save to dataBase Nero : " + customer.getFirstName());
			super.save(customer);
			
		}else {
			
			System.out.println("Don't save to database Nero. Not a valid person ");
		}
		
		
		
	}

}
