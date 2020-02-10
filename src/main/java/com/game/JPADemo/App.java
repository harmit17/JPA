package com.game.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
        POJO pojo = entityManager.find(POJO.class, 1);
        System.out.println(pojo);
        POJO pojo1 = entityManager.find(POJO.class, 2);
        System.out.println(pojo1);
        
    }
}
