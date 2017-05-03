package com.yatra.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.yatra.entities.Contact;
import com.yatra.entities.Employee;
import com.yatra.injectors.AppInjector;

public class MainClass {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        Application application = injector.getInstance(Application.class);
        application.addEmployee(new Employee(1,"Prem"));
        application.addContact(new Contact("8800092157","New delhi"));
    }
}
