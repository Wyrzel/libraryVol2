package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book extends Publication {


    @OneToMany(mappedBy = "book")
    private List<BookCopy> bookCopies;

    @Column(name = "category")
    private String category;

}
