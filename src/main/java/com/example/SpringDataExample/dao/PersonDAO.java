package com.example.SpringDataExample.dao;

import com.example.SpringDataExample.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {
    public List<Person> findByFullNameLike(String name);

    public List<Person> findByDateOfBirthGreaterThan(Date date);
}
