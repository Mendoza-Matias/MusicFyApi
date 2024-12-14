package com.mmendoza.soccer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "news")

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class News {

    @Id
    private Integer newsId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date_publication", updatable = false)
    @CreatedDate
    private LocalDate datePublication;

    @JoinTable(
            name = "news_labels",
            joinColumns = @JoinColumn(name = "news_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "label_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Label> labels;

    public void addLabel(Label label) {
        if (this.labels == null)
            this.labels = new ArrayList<>();
        this.labels.add(label);
    }
}
