package com.study.board.repository;

import com.study.board.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    public boolean existsByUserEmailAndUserPassword(String userEmail, String userPassword);
}
