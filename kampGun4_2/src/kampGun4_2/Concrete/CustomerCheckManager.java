package kampGun4_2.Concrete;

import kampGun4_2.Abstract.CustomerCheckService;
import kampGun4_2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckPerson(Customer customer) {
		
		return true;
	}

}
