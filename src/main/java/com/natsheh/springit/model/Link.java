package com.natsheh.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
// we do not need to use the @Table anotation, since this should indicate if there is a special name for the table
// by default it will look/create table same name as class name.
public class Link {

    @Id             //specifies the primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String url;

}
