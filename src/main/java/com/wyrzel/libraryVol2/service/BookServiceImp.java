package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Book;
import com.wyrzel.libraryVol2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements GenericService<Book> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
