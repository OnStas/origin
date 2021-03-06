package org.infin.data;

import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.infin.data.eneties.User;
public class HibernateUtil {


	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(User.class);
			return configuration
					.buildSessionFactory(new ServiceRegistryBuilder()
							.buildServiceRegistry());
//			.buildSessionFactory(new StandardServiceRegistryBuilder()
//					.build());
		
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	
	
}
