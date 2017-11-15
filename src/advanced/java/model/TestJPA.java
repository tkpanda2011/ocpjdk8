package advanced.java.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJPA {
	 private static final String PERSISTENCE_UNIT_NAME = "OCPJPJAVA8";
     private static EntityManagerFactory factory;
	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("SELECT u FROM Employee u");
        List<Employee> empList = q.getResultList();
        System.out.println(empList.size());
	}

}
