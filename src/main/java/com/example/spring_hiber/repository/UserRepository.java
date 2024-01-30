package com.example.spring_hiber.repository;

import com.example.spring_hiber.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
