package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Author;
import com.wyrzel.libraryVol2.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImp implements GenericService<Author> {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.getOne(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
