package dorduncuHafta1.abstracts;

import dorduncuHafta1.entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veri taban�na kaydedildi: " + customer.getFirstName());
		
	}
	
	

}
