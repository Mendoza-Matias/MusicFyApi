package com.mmendoza.soccer.controller.impl;

import com.mmendoza.soccer.controller.INewsController;
import com.mmendoza.soccer.domain.News;
import com.mmendoza.soccer.domain.dto.label.LabelDto;
import com.mmendoza.soccer.domain.dto.news.NewsDto;
import com.mmendoza.soccer.services.news.ServGetAllNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class NewsController implements INewsController {

    @Autowired
    private ServGetAllNews servGetAllNews;

    @Override
    public List<NewsDto> getAllNews() {
        List<News> serv = servGetAllNews.serv(null);
        return null;
    }

    @Override
    public NewsDto getNewById() {
        return null;
    }

    @Override
    public NewsDto getNewByTitle() {
        return null;
    }

    @Override
    public List<NewsDto> getAllNewsRelatedByLabel(LabelDto label) {
        return null;
    }
}
