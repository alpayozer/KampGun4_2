package kampGun4_2;

import java.util.Date;

import kampGun4_2.Abstract.BaseCustomerManager;
import kampGun4_2.Adapter.MernisServiceAdapter;
import kampGun4_2.Concrete.NeroCustomerManager;
import kampGun4_2.Concrete.StarbucksCustomerManager;
import kampGun4_2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer realCustomer = new Customer(1,"Alpay","Özer","32983406432",new Date(2002,7,23));
		Customer fakeCustomer = new Customer(2,"Murat","Seker","35612836350",new Date(2005,6,10));
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		neroCustomerManager.save(realCustomer);
		neroCustomerManager.save(fakeCustomer);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);

	}

}
