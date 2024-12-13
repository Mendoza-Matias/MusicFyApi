package com.mmendoza.soccer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
