package com.yatra.util;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Singleton
public class EntityManagerProviderUtil {

    @Inject
    public EntityManagerProviderUtil(){}

    public EntityManager getEntityManager(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "practiseJPA" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        System.out.println("Entity manager created");
        return entitymanager;
    }


}
