package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "bookCopy")
public class BookCopy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Book book;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publish_year")
    private Integer publishYear;

    @Column(name = "pages")
    private Integer pages;

    @OneToMany(mappedBy = "bookCopy")
    private List<Rent> rents;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_copy_status", nullable = false)
    private  BookCopyStatus status =BookCopyStatus.AVALIBLE;


}
