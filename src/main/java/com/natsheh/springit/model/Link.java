package com.natsheh.springit.model;

import com.natsheh.springit.audit.Auditable;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
// we do not need to use the @Table anotation, since this should indicate if there is a special name for the table
// by default it will look/create table same name as class name.
public class Link extends Auditable {

    @Id             //specifies the primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // maybe it should removed and be handled from the database side idk.
    private Long id;
    private String title;
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments;

    public Link() {
        this.comments = new ArrayList<>();
    }


}
