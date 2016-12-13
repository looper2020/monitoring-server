package manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PolygonalPointsManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public PolygonalPointsManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}

}
