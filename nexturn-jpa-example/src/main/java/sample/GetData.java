package sample;

import java.beans.PersistenceDelegate;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetData {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn_pu");
		EntityManager manager = factory.createEntityManager();
		// to get a single object
		
		Student std = manager.find(Student.class, 1002);
//		System.out.println(std);
		
		
		// Now to get all the objects
		Query query = manager.createQuery("from Student");
		List<Student> stdList = query.getResultList();
		stdList.forEach(s->System.out.println(s));
		
	}

}
