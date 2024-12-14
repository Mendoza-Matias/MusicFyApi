package com.mmendoza.soccer.services.news;

import com.mmendoza.soccer.domain.News;
import com.mmendoza.soccer.domain.exceptions.NewException;
import com.mmendoza.soccer.repository.INewsRepository;
import com.mmendoza.soccer.utils.ServGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServGetAllNews extends ServGeneric<Void, List<News>> {

    @Autowired
    private INewsRepository newsRepository;

    @Override
    public List<News> serv(Void request) {
        List<News> news = newsRepository.findAll();
        if (news.isEmpty())
            throw new NewException("No news");
        return news;
    }
}
