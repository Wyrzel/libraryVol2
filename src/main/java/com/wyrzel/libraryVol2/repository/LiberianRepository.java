package com.wyrzel.libraryVol2.repository;

import com.wyrzel.libraryVol2.entity.Liberian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiberianRepository extends JpaRepository<Liberian, Long> {
}
