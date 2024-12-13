package com.mmendoza.soccer.repository;

import com.mmendoza.soccer.domain.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewRepository extends JpaRepository<New, Integer> {
}
