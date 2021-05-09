package dorduncuHafta1.concretes;

import dorduncuHafta1.abstracts.PersonCheckService;
import dorduncuHafta1.entities.Customer;

public class CustomerCheckManager implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
