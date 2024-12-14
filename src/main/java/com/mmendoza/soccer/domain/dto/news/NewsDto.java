package com.mmendoza.soccer.domain.dto.news;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.mmendoza.soccer.domain.dto.label.LabelDto;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
@JsonRootName(value = "news")
public class NewsDto {

    @JsonProperty(value = "news_id")
    private Integer newsId;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "date_publication")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd")
    private LocalDate datePublication;

    @JsonProperty(value = "labels")
    private List<LabelDto> labels;
}
