package com.prashanth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
