package com.natsheh.springit.model;

import com.natsheh.springit.audit.Auditable;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data

public class Link extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments;

    {
        this.comments = new ArrayList<>();
    }


    public Link() {
    }

    public Link(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
