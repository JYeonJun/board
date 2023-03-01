package com.study.board.repository;

import com.study.board.entity.PopularSearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularSearchRepository extends JpaRepository<PopularSearchEntity, String> {
}
