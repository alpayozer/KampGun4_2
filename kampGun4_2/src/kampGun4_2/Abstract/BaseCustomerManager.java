package kampGun4_2.Abstract;

import kampGun4_2.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Save to dataBase : " + customer.getFirstName());
		
	}
	

}
