package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchRow;
import model.Factorys;

public class FactorysManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public FactorysManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<Factorys> list() {
		Query query = em.createQuery("SELECT f FROM Factorys f");
		Collection<Factorys> factorysCollection = new ArrayList<Factorys>();
		for(Factorys factorys: (ArrayList<Factorys>) query.getResultList()){
			factorysCollection.add(factorys);
		}
		
		return factorysCollection;
	}
	
	public Factorys findByPrimaryKey(int primaryKey) throws NoSuchRow{
		Factorys factorys = em.find(Factorys.class, primaryKey);	
		
		if (factorys == null){
			throw new NoSuchRow("Factorys");
		}
		else{
			return factorys;
		}
	}

	public void close() {
		em.close();
	}
}
