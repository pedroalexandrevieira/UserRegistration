package com.example.testCanadWithGradlle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testCanadWithGradlle.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
