package manager;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.NoSuchRow;
import model.AdditionalMasterData;

public class AdditionalMasterDataManager {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;

	public AdditionalMasterDataManager(String persistenceUnit) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
	}
	
	public Collection<AdditionalMasterData> list() {
		Query query = em.createQuery("SELECT a FROM AdditionalMasterData a");
		Collection<AdditionalMasterData> additionalMasterDataCollection = new ArrayList<AdditionalMasterData>();
		for(AdditionalMasterData additionalMasterData : (ArrayList<AdditionalMasterData>) query.getResultList()){
			additionalMasterDataCollection.add(additionalMasterData);
		}
		
		return additionalMasterDataCollection;
	}
	
	public AdditionalMasterData findByPrimaryKey(int primaryKey) throws NoSuchRow{
		AdditionalMasterData additionalMasterData = em.find(AdditionalMasterData.class, primaryKey);	
		
		if (additionalMasterData == null)
			throw new NoSuchRow("AdditionalMasterData");
		else
			return additionalMasterData;
	}

	public void close() {
		em.close();
	}
}
