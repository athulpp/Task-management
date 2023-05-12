package com.example.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task.entity.Users;

public interface UserRepository extends JpaRepository <Users,Long> {

}
