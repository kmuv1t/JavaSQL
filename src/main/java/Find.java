import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Find {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("fiapmovies").createEntityManager();
				
		System.out.println(em.find(Movie.class, 1));
		
		em.close();
	}

}
