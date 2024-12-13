package com.mmendoza.soccer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "news")

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class New {

    @Id
    private Integer newsId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date_publication", updatable = false)
    @CreatedDate
    private LocalDate datePublication;

}
