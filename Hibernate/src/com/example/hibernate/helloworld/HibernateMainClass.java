package com.example.hibernate.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMainClass {

	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		Message message = new Message();
		message.setMessageText("Hello World");
		MessageNew msgNew = new MessageNew();
		msgNew.setMessageText("Annotated Hello World");

		Session session = factory.openSession();
		session.save(message);
		session.save(msgNew);
		session.close();

	}

}
