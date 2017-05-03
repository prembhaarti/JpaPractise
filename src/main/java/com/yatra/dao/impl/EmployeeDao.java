package com.yatra.dao.impl;

import com.yatra.dao.Dao;

import javax.inject.Singleton;

@Singleton
public class EmployeeDao<Employee> implements Dao<Employee> {


    @Override
    public void insert(Employee employee) {
        System.out.println("Employee added"+employee);
    }
}
