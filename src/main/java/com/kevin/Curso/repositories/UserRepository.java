package com.kevin.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
