package sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerApp {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn_pu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		
		Customer customer = new Customer();
		
		customer.setcustName("Zamin");
		
		trans.begin();
		
		manager.persist(customer);
		
		trans.commit();
		
		manager.close();
		
		
	}

	

}
