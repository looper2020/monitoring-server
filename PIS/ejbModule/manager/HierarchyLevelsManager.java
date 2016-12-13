package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchHierarchyLevel;
import model.HierarchyLevels;

public class HierarchyLevelsManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public HierarchyLevelsManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<HierarchyLevels> list() {
		Query query = em.createQuery("SELECT h FROM HierarchyLevels h");
		Collection<HierarchyLevels> hierarchyLevelCollection = new ArrayList<HierarchyLevels>();
		for(HierarchyLevels hierarchyLevels: (ArrayList<HierarchyLevels>) query.getResultList()){
			hierarchyLevelCollection.add(hierarchyLevels);
		}
		
		return hierarchyLevelCollection;
	}
	
	public HierarchyLevels findByPrimaryKey(int primaryKey) throws NoSuchHierarchyLevel{
		HierarchyLevels hierarchyLevels = em.find(HierarchyLevels.class, primaryKey);	
		
		if (hierarchyLevels == null){
			throw new NoSuchHierarchyLevel();
		}
		else{
			return hierarchyLevels;
		}
	}

	public void close() {
		em.close();
	}

}
