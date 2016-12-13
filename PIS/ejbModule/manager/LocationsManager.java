package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchLocation;
import model.Locations;

public class LocationsManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public LocationsManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<Locations> list() {
		Query query = em.createQuery("SELECT l FROM Locations l");
		Collection<Locations> locationsCollection = new ArrayList<Locations>();
		for(Locations locations: (ArrayList<Locations>) query.getResultList()){
			locationsCollection.add(locations);
		}
		
		return locationsCollection;
	}
	
	public Locations findByPrimaryKey(int primaryKey) throws NoSuchLocation{
		Locations locations = em.find(Locations.class, primaryKey);	
		
		if (locations == null){
			throw new NoSuchLocation();
		}
		else{
			return locations;
		}
	}

	public void close() {
		em.close();
	}

}
