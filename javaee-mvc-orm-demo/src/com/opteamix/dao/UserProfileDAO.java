package com.opteamix.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.opteamix.beans.UserProfile;

public class UserProfileDAO implements UserProfileOperations{

	@Override
	public int store(UserProfile userProfile) {
		int status = 0;
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (userProfile != null) {
			session.save(userProfile);
			transaction.commit();
			status = 1;
		}
		session.close();
		sessionFactory.close();		
		return status;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserProfile> getAllUsers() {
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(UserProfile.class);
		List<UserProfile> allUsers = criteria.list();
		session.close();
		sessionFactory.close();
		return allUsers;
	}

	@Override
	public UserProfile authenticate(String username, String password) {
		UserProfile userProfile = null;
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		UserProfile databaseProfile = session.get(UserProfile.class, username);
		if (databaseProfile != null) {
			if(password.equals(databaseProfile.getPassword())) {
				userProfile = databaseProfile;
			}
		}
		session.close();
		sessionFactory.close();
		return userProfile;
	}

	@Override
	public UserProfile findByphoneNumber(String phoneNumber) {
		SessionFactory sessionFactory = HibernateUtility.createSessionFactory();
		Session session = sessionFactory.openSession();
		UserProfile profile = null;
		Criteria criteria = session.createCriteria(UserProfile.class);
		criteria.add(Restrictions.eq("phone", phoneNumber));
		List<UserProfile> list = criteria.list();
		for (UserProfile userProfile : list) {
			if(phoneNumber.equals(userProfile.getPhone())){
				profile = userProfile;
				break;
			}
		}
		return profile;
	}

}