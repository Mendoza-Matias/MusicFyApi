package com.mmendoza.soccer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "labels")

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Label {

    @Id
    private Integer labelId;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "labels")
    private List<News> news;
}
