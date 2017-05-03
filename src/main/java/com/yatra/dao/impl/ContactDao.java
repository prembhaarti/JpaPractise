package com.yatra.dao.impl;

import com.yatra.entities.Contact;

import javax.inject.Singleton;

@Singleton
public class ContactDao extends DaoImpl<Contact>{

    @Override
    public void insert(Contact contact) {
        System.out.println("Contact inserted:"+contact);
    }

}
