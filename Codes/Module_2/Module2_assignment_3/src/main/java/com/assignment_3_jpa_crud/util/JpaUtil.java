package Module_2.Module2_assignment_3.src.main.java.com.assignment_3_jpa_crud.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class JpaUtil {
	private static final EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("jpa-unit");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public void shutDown() {
		emf.close();
	}
}
