package dorduncuHafta1.concretes;

import dorduncuHafta1.abstracts.BaseCustomerManager;
import dorduncuHafta1.abstracts.PersonCheckService;
import dorduncuHafta1.entities.Customer;




public class StarbucksCustomerManager extends BaseCustomerManager {
	public PersonCheckService _personCheckService;
	
	
	public StarbucksCustomerManager(PersonCheckService _personCheckService) {
		this._personCheckService = _personCheckService;
	}
	public void save(Customer customer) {
		
		if(_personCheckService.checkIfRealPerson(customer) == true)
		{
			super.save(customer);
		}
		else 
		{
			System.out.println("Not a valid person");
		}
	}
	


}	
	