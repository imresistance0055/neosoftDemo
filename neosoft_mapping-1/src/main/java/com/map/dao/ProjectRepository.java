package com.map.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.map.entity.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
