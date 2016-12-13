package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchRow;
import model.Buildings;

public class BuildingsManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public BuildingsManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<Buildings> list() {
		Query query = em.createQuery("SELECT b FROM Buildings b");
		Collection<Buildings> buildingsCollection = new ArrayList<Buildings>();
		for(Buildings buildings: (ArrayList<Buildings>) query.getResultList()){
			buildingsCollection.add(buildings);
		}
		
		return buildingsCollection;
	}
	
	public Buildings findByPrimaryKey(int primaryKey) throws NoSuchRow{
		Buildings buildings = em.find(Buildings.class, primaryKey);	
		
		if (buildings == null){
			throw new NoSuchRow("Buildings");
		}
		else{
			return buildings;
		}
	}

	public void close() {
		em.close();
	}

}
