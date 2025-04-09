package JPAQLExamples;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import sample.Student;

public class NamedQueries {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nexturn_pu");
		EntityManager manager = factory.createEntityManager();
		//Named Queries
		
		Query namedQuery = manager.createNamedQuery("findAllStudents");
		
		List<Student> namedList = namedQuery.getResultList();
		
		namedList.forEach((s)-> System.out.println(s));
		
		System.out.println();
		
		Query qry2 = manager.createNamedQuery("findByRegNo");
		qry2.setParameter(1, 1002);
		List<Student> list2 = qry2.getResultList();
		list2.forEach((s)-> System.out.println(s));
	
	}

}
