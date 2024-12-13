package com.mmendoza.soccer.repository;

import com.mmendoza.soccer.domain.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelRepository extends JpaRepository<Label, Integer> {
}
