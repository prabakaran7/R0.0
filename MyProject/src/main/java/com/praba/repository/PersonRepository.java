package com.praba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praba.pojo.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
