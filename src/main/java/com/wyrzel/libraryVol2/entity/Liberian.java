package com.wyrzel.libraryVol2.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "liberian")
public class Liberian extends Person{

    @Enumerated(EnumType.STRING)
    @Column(name = "job_title")
    private LiberianRole role;

    @Temporal(TemporalType.DATE)
    @Column(name = "employment_date")
    private Date employmentDate;

}
