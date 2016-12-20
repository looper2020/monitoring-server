package manager;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exceptions.NoSuchRow;

public class DefaultManager {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private Class<?> clazz;

	public DefaultManager(String persistenceUnit, Class<?> clazz) {
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		em = emf.createEntityManager();
		this.clazz = clazz;
	}

	public Collection<Object> list() {
		return em.createQuery("SELECT u FROM " + clazz.getSimpleName() + " u").getResultList();
	}

	public Object findByPrimaryKey(int primaryKey) throws NoSuchRow {
		Object o = em.find(clazz, primaryKey);

		if (o == null) {
			throw new NoSuchRow(clazz.getSimpleName());
		} else {
			return o;
		}
	}

	public void close() {
		em.close();
	}
}
