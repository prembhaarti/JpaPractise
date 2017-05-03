package com.yatra.dao;

import java.io.Serializable;

public interface Dao<T> extends Serializable{

    void insert(T object);
}
