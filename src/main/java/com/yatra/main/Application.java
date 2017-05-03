package com.yatra.main;

import com.yatra.dao.impl.EmployeeDaoImpl;
import com.yatra.entities.Contact;
import com.yatra.entities.Employee;
import com.yatra.util.EntityManagerProviderUtil;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Application {

    @Inject
    EmployeeDaoImpl employeeDao;

    public void addEmployee(Employee employee) {
        employeeDao.insert(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(1);
    }
    public List<Employee> getEmployeeByName(String name) {
        return employeeDao.getEmployeeByName(name);
    }
}
