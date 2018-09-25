package com.opteamix.beans;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {
	public static SessionFactory createSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		return cfg.buildSessionFactory();	
	}
}
