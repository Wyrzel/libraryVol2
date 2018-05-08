package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Publication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationServiceImp implements GenericService<Publication> {

    @Override
    public void save(Publication publication) {

    }

    @Override
    public Publication findById(Long id) {
        return null;
    }

    @Override
    public List<Publication> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
