package com.yatra.dao.impl;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Singleton
public class DaoImpl<T>{


    @Transactional(
            rollbackOn = {Exception.class}
    )
    public void insert(T object) {
        EntityManager manager= getEntityManager();
//        manager.getTransaction().begin();
        manager.persist(object);
//        manager.getTransaction().commit();
        System.out.println("added"+object);
    }

    public Query createQuery(String query) {
        return getEntityManager().createQuery(query);
    }

    public T findById(Class<T> clazz, int id) {
        return getEntityManager().find(clazz, id);
    }

    public EntityManager getEntityManager(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "practiseJPA" );
        System.out.println("Entity created.");
        return emfactory.createEntityManager();
    }


}
