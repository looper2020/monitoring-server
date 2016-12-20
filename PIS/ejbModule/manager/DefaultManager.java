package manager;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exceptions.NoSuchRow;

public class DefaultManager {

	private EntityManagerFactory emf = null;
	//managed die Datenbankzugriffe
	private EntityManager em = null;
	//die konkrete Bean
	private Class<?> clazz;

	public DefaultManager(String persistenceUnit, Class<?> clazz) {
		//Erstellung der Factory
		emf = Persistence.createEntityManagerFactory(persistenceUnit);
		//Erstellung des EntityManager
		em = emf.createEntityManager();
		this.clazz = clazz;
	}

	public Collection<Object> list() {
		//EntityManager erstellt eine Query auf die tabelle der gleichnamigen oben gesetzten Klasse
		//und gibt dies als Collection von Objects zurück
		return em.createQuery("SELECT u FROM " + clazz.getSimpleName() + " u").getResultList();
	}

	public Object findByPrimaryKey(int primaryKey) throws NoSuchRow {
		//EntityManager sucht in der Tabelle der gleichnamigen oben gesetzten Klasse
		//nach Eintrag mit in Parametern übergebener Primärschlüssel
		//und sichert dies in einem Object
		Object o = em.find(clazz, primaryKey);

		//Prüfung ob ein passender Eintrag in der Tabelle gefunden wurde
		if (o == null) {
			//falls kein Eintrag gefunden wurde wirf exception
			throw new NoSuchRow(clazz.getSimpleName());
		} else {
			//falls ein Eintrag gefunden wurde liefere das Object zurück
			return o;
		}
	}

	public void close() {
		em.close();
	}
}
