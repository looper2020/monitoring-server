package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchRow;
import model.Addresses;

public class AddressesManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public AddressesManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<Addresses> list() {
		Query query = em.createQuery("SELECT a FROM Addresses a");
		Collection<Addresses> addressesCollection = new ArrayList<Addresses>();
		for(Addresses addresses: (ArrayList<Addresses>) query.getResultList()){
			addressesCollection.add(addresses);
		}
		
		return addressesCollection;
	}
	
	public Addresses findByPrimaryKey(int primaryKey) throws NoSuchRow{
		Addresses addresses = em.find(Addresses.class, primaryKey);	
		
		if (addresses == null){
			throw new NoSuchRow("Addresses");
		}
		else{
			return addresses;
		}
	}

	public void close() {
		em.close();
	}

}
