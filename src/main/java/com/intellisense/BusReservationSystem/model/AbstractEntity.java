package com.intellisense.BusReservationSystem.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastUpdatedDate")
    private Date lastUpdatedDate;

    @Column(name = "lastUpdatedBy")
    private String lastUpdatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdDate", updatable = false)
    private Date createdDate;

    @Column(name = "createdBy", updatable = false)
    private String createdBy;

}
