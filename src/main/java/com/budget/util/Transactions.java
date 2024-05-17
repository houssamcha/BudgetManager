package com.budget.util;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.budget.model.Utilisateur;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class Transactions {
	public static void main(String [] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setUtilisateur("FirstUtilisateur");
		Session session = factory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(utilisateur);
		
		ts.commit();
		
		session.close();
	}
}
