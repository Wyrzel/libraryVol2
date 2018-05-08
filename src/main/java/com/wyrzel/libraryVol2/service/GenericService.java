package com.wyrzel.libraryVol2.service;

import java.util.List;

public interface GenericService<T> {

    void save(T t);

    T findById(Long id);

    List<T> findAll();

    void delete(Long id);

}
