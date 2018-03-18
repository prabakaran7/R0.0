package com.praba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praba.pojo.Person;
import com.praba.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	@Transactional
	public void addPerson(Person p) {
		repository.save(p);
	}

	@Transactional
	public void updatePerson(Person p) {
		repository.save(p);
	}

	@Transactional(readOnly=true)
	public List<Person> listPersons() {
		return (List<Person>) repository.findAll();
	}

	@Transactional(readOnly=true)
	public Optional<Person> getPersonById(int id) {
		return repository.findById(id);
	}

	@Transactional
	public void removePerson(int id) {
		repository.deleteById(id);
	}

}
