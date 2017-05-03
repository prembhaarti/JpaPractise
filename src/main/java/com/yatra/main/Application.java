package com.yatra.main;

import com.yatra.dao.Dao;
import com.yatra.entities.Contact;
import com.yatra.entities.Employee;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class Application {
    Dao employeeDao;
    Dao contactDao;

    @Inject
    public void setEmployeeDao(@Named("employee") Dao employeeDao) {
        this.employeeDao=employeeDao;
    }

    @Inject
    public void setContactDao(@Named("contact") Dao contactDao) {
        this.contactDao=contactDao;
    }


    public void addEmployee(Employee employee) {
        employeeDao.insert(employee);
    }

    public void addContact(Contact contact) {
        contactDao.insert(contact);
    }
}
