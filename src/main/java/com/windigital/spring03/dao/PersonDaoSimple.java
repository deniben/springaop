package com.windigital.spring03.dao;

import org.springframework.stereotype.Repository;
import com.windigital.spring03.domain.Person;

@Repository
public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
