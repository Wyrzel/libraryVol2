package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author extends Person {

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;


}
