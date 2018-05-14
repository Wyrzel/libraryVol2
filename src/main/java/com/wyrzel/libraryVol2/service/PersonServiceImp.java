package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Person;
import com.wyrzel.libraryVol2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements GenericService<Person> {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findById(Long id) {
        return personRepository.getOne(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void delete(Long id) {


        personRepository.deleteById(id);
    }


}
