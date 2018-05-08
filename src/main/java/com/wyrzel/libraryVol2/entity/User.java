package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user")
public class User extends Person{

    @Column(name = "phone_number")
    private Integer phoneNumber;


}
