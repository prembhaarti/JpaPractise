package com.yatra.dao.impl;

import com.yatra.entities.Employee;

import javax.inject.Singleton;
import javax.persistence.Query;
import java.util.List;

@Singleton
public class EmployeeDaoImpl extends DaoImpl<Employee> {

    public Employee getEmployeeById(int id) {
        return findById(Employee.class, id);
    }
    public List<Employee> getEmployeeByName(String name) {
        Query query = createQuery("from Employee where name=:name");
        query.setParameter("name", name);
        return (List<Employee>)query.getResultList();
    }

}
