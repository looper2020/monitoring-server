package manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SequenceManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public SequenceManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
}