package com.example.demo.reprository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Lesson;

public interface LessonRepository  extends JpaRepository<Lesson, Integer>{

}
