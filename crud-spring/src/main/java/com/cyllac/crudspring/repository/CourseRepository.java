package com.cyllac.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyllac.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
