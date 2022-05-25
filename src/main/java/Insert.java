import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("fiapmovies").createEntityManager();
		
		Movie filme = new Movie(
				1, 
				"Anjos da lei",
				"Policiais disfardos de universitários.",
				"Comédia", 
				"Netflix",
				true, 
				5
			);
		
		try {
			em.persist(filme);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		em.close();
	}

}
