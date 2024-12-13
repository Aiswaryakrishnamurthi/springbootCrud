package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.studentEntity;

public interface studentRepos extends JpaRepository<studentEntity,Integer> {

}
