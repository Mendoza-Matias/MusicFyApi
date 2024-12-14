package com.mmendoza.soccer.repository;

import com.mmendoza.soccer.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewsRepository extends JpaRepository<News, Integer> {
}
