package dorduncuHafta1;

import java.rmi.RemoteException;


import dorduncuHafta1.abstracts.BaseCustomerManager;
import dorduncuHafta1.adapters.MernisServiceAdapter;
import dorduncuHafta1.concretes.NeroCustomerManager;
import dorduncuHafta1.concretes.StarbucksCustomerManager;
import dorduncuHafta1.entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"GÜLSEVÝM", "ÞENER", 1975, "12469164384"));
		
		BaseCustomerManager customerManager2 =new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(1,"GÜLSEVÝM", "ÞENER", 1975, "12469164384"));
		
		
		
		 
	}

}


