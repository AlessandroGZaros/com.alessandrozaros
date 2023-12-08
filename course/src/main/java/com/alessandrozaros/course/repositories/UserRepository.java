package com.alessandrozaros.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrozaros.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
