package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Rent;
import com.wyrzel.libraryVol2.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImp implements GenericService<Rent> {


    @Autowired
    RentRepository rentRepository;

    @Override
    public void save(Rent rent) {
        rentRepository.save(rent);
    }

    @Override
    public Rent findById(Long id) {
        return rentRepository.getOne(id);
    }

    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        rentRepository.deleteById(id);
    }
}
