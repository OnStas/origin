package org.infin.data;

import java.util.Date;

import org.hibernate.Session;
import org.infin.data.eneties.User;

public class Aplication {

	public static void main(String[] args) {
			
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		

		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedBy("kevinBoo");
		user.setCreatedDate(new Date());
		user.setEmailAddress("kmb385@yahoo.com");
		user.setFirstName("Kevin");
		user.setLastName("Bowersox");
		user.setLastUpdatedBy("kevin");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
