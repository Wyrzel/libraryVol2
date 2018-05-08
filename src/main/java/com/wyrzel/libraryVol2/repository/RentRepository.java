package com.wyrzel.libraryVol2.repository;

import com.wyrzel.libraryVol2.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
}
