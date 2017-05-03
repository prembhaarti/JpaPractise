package com.yatra.injectors;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.yatra.dao.Dao;
import com.yatra.dao.impl.ContactDao;
import com.yatra.dao.impl.EmployeeDao;

public class AppInjector extends AbstractModule{

    @Override
    protected void configure() {
        bind(Dao.class).annotatedWith(Names.named("employee")).to(EmployeeDao.class);
        bind(Dao.class).annotatedWith(Names.named("contact")).to(ContactDao.class);
    }
}
