package com.teamtreehouse.core;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private final Long id;
    @Version
    private Long version;

    protected BaseEntity() {
        id = null;
    }
}
