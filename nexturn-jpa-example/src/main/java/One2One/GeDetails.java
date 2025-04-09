package One2One;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeDetails {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn_pu");
		EntityManager manager = factory.createEntityManager();
		Person person = manager.find(Person.class, 3);
		
		System.out.println(person.getPersonId()+ " " + person.getPersonName());
		
		Passport passport = manager.find(Passport.class , "Z58");
		
		System.out.println(passport.getPassportNo()+ " " + passport.getDateIssued() + " "+ passport.getDateExpiry()+ " "
				+ passport.getPerson().getPersonId()+ " "+ passport.getPerson().getPersonName());
		
	}

}
