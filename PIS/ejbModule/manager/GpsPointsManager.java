package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchGpsPoint;
import model.GpsPoints;

public class GpsPointsManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public GpsPointsManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<GpsPoints> list() {
		Query query = em.createQuery("SELECT g FROM GpsPoints g");
		Collection<GpsPoints> gpsPointsCollection = new ArrayList<GpsPoints>();
		for(GpsPoints gpsPoints: (ArrayList<GpsPoints>) query.getResultList()){
			gpsPointsCollection.add(gpsPoints);
		}
		
		return gpsPointsCollection;
	}
	
	public GpsPoints findByPrimaryKey(int primaryKey) throws NoSuchGpsPoint{
		GpsPoints gpsPoints = em.find(GpsPoints.class, primaryKey);	
		
		if (gpsPoints == null){
			throw new NoSuchGpsPoint();
		}
		else{
			return gpsPoints;
		}
	}

	public void close() {
		em.close();
	}
}
