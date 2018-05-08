package com.wyrzel.libraryVol2.repository;


import com.wyrzel.libraryVol2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
