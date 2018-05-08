package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.BookCopy;
import com.wyrzel.libraryVol2.repository.BookCopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopyServiceImp implements GenericService<BookCopy> {

    @Autowired
    BookCopyRepository bookCopyRepository;

    @Override
    public void save(BookCopy bookCopy) {
        bookCopyRepository.save(bookCopy);
    }

    @Override
    public BookCopy findById(Long id) {
        return bookCopyRepository.getOne(id);
    }

    @Override
    public List<BookCopy> findAll() {
        return bookCopyRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        bookCopyRepository.deleteById(id);

    }
}
