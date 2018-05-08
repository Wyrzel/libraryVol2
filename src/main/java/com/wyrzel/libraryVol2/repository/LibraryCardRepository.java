package com.wyrzel.libraryVol2.repository;

import com.wyrzel.libraryVol2.entity.LibraryCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryCardRepository extends JpaRepository<LibraryCard, Long> {


    @Query("SELECT L FROM LibraryCard L WHERE L.status='ACTIVE'")
    List<LibraryCard> findAllActive();



}
