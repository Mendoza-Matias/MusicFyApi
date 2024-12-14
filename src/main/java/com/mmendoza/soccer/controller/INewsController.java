package com.mmendoza.soccer.controller;

import com.mmendoza.soccer.domain.dto.label.LabelDto;
import com.mmendoza.soccer.domain.dto.news.NewsDto;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("soccer/api/news")
public interface INewsController {
    List<NewsDto> getAllNews();

    NewsDto getNewById();

    NewsDto getNewByTitle();

    List<NewsDto> getAllNewsRelatedByLabel(LabelDto label);
}
