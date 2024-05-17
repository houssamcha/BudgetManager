package com.budget.util;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.budget.model.Utilisateur;



public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

          if(sessionFactory == null) { 
          Configuration configuration = new Configuration();
          Properties properties = new Properties();
          properties.put(Environment.DRIVER,"org.postgresql.Driver");
          properties.put(Environment.URL,"jdbc:postgresql://localhost:5432/BudgetManager");
          properties.put(Environment.USER,"postgres");
          properties.put(Environment.PASS,"1999");
          properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
          properties.put(Environment.HBM2DDL_AUTO,"update");
          properties.put(Environment.SHOW_SQL,true);

          configuration.setProperties(properties);
          configuration.addAnnotatedClass(Utilisateur.class);

          ServiceRegistry serviceRegistry = new
          StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
          .build();

          sessionFactory=configuration.buildSessionFactory(serviceRegistry); }




          return sessionFactory; 
          }
}