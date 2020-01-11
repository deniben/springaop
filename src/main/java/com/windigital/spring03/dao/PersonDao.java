package com.windigital.spring03.dao;

import com.windigital.spring03.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
