package manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MachineLiveDataManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public MachineLiveDataManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}

}
