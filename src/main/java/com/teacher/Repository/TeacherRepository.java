package com.teacher.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Serializable>{

}
