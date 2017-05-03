package com.yatra.dao.impl;

import com.yatra.dao.Dao;

import javax.inject.Singleton;

@Singleton
public class ContactDao<Contact> implements Dao<Contact>{

    @Override
    public void insert(Contact contact) {
        System.out.println("Contact inserted:"+contact);
    }
}
