package com.mainproject.middleware.backend.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DBConfig {
	 //public static final SessionFactory sessionFactory = buildSessionFactory();
	
	    @Bean(name = "sessionFactory")
	    public SessionFactory buildSessionFactory() {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    //public static SessionFactory getSessionFactory() {
	    //    return sessionFactory;
	    //}
	 
	    }
