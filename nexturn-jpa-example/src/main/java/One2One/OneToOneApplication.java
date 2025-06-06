package One2One;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class OneToOneApplication {

	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn_pu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
//		Person person = new Person();
//		person.setPersonName("Zain");
		
		Person person = manager.find(Person.class,1);
		
		Passport passport = new Passport();
		passport.setPassportNo("V456");
		passport.setDateIssued(new Date());
		passport.setDateExpiry(new Date());
		
		passport.setPerson(person);
		
		transaction.begin();
		
		manager.persist(passport);
		
		transaction.commit();
		
		manager.close();
		
		
		
	}
}
