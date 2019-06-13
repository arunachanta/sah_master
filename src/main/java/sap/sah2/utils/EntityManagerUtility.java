package sap.sah2.utils;
import javax.persistence.EntityManager;

/**
 * 
 * Utility class for initializing entity manager factory.
 * 
 */
public class EntityManagerUtility {

	private static EntityManager em;

	public static EntityManager getEntityManager() {
		if (em == null) {
			throw new IllegalArgumentException(
					"EntityManagerFactory is not initialized!!!");
		}
		return em;
	}

	public static void setEntityManager(EntityManager em) {
		EntityManagerUtility.em = em;
	}

}