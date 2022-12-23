package com.teacher.Service;

import org.springframework.stereotype.Service;

import com.teacher.entity.Teacher;

@Service
public interface TeacherService{
	public Teacher saveTeacher(Teacher teacher);

}
