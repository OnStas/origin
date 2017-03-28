package org.infin.data;

import org.hibernate.Session;

public class Aplication {

	public static void main(String[] args) {
			
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
		
	}

}
