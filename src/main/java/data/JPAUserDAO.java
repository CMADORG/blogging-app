package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import blogexceptions.DuplicateUserException;
import schema.UserSchema;

public class JPAUserDAO implements UserDAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.myblogger.blog"); 

	public JPAUserDAO() {
		// TODO Auto-generated constructor stub
	}

	public boolean addUser(UserSchema u) throws DuplicateUserException{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query q = em.createQuery("SELECT v FROM UserSchema v where v.userName=" +"\'" +u.getUserName() +"\'");
		
		List<UserSchema> s = q.getResultList();
				 
		try{
			if( s.size() == 0)
			{
				em.persist(u);
			}
			else
			{
				throw new DuplicateUserException("User already exists");
			}
		}
		finally{
			em.getTransaction().commit();
			em.close();
		}	
		return true;
	}

	public int findUser(String u) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//		Query q = em.createQuery("SELECT u FROM UserSchema u WHERE u.userName LIKE " +u);
		Query q = em.createQuery("SELECT u FROM UserSchema u");
		List<UserSchema> s = q.getResultList();
		System.out.println("JPAUserDAO.findUser()" +s.get(0).getUserId());
	     em.getTransaction().commit();
		em.close();
		return s.get(0).getUserId();

		
	}
	
	

}
