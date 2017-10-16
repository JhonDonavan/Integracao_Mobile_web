package model.dao;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Named
public class JPAUtil {
	public static EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
		
		EntityManager em = factory.createEntityManager();
		
		return em;
	}
}