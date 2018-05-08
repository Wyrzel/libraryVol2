package com.wyrzel.libraryVol2.service;

import com.wyrzel.libraryVol2.entity.Liberian;
import com.wyrzel.libraryVol2.repository.LiberianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiberianServiceImp implements GenericService<Liberian> {

    @Autowired
    private LiberianRepository liberianRepository;

    @Override
    public void save(Liberian liberian) {
        liberianRepository.save(liberian);
    }

    @Override
    public Liberian findById(Long id) {
        return liberianRepository.getOne(id);
    }

    @Override
    public List<Liberian> findAll() {
        return liberianRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        liberianRepository.deleteById(id);
    }
}
