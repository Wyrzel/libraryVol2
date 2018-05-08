package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "library_card")
public class LibraryCard {

    public enum Status {

        ACTIVE, UNACTIVE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_date", nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @Enumerated(EnumType.STRING)
    @Column(name = "libery_card_status")
    private Status status = Status.UNACTIVE;


}