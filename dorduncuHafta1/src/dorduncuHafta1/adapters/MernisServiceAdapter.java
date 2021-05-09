package dorduncuHafta1.adapters;

import java.rmi.RemoteException;


import dorduncuHafta1.abstracts.PersonCheckService;
import dorduncuHafta1.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(
					Long.parseUnsignedLong(customer.getNationalityId()), 
					customer.getFirstName(),
					customer.getLastName(), 
					customer.getDateOfBirth()
					
					);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}