package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.LibraryCard;
import com.wyrzel.libraryVol2.repository.LibraryCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryCardServiceImp implements GenericService<LibraryCard> {

    @Autowired
    LibraryCardRepository libraryCardRepository;

    @Override
    public void save(LibraryCard libraryCard) {
        libraryCardRepository.save(libraryCard);
    }

    @Override
    public LibraryCard findById(Long id) {
        return libraryCardRepository.getOne(id);
    }

    @Override
    public List<LibraryCard> findAll() {
        return libraryCardRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        libraryCardRepository.deleteById(id);
    }

    public List<LibraryCard> findAllActive(){
        return libraryCardRepository.findAllActive();
    }
}
