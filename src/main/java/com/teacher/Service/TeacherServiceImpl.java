package com.teacher.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.Repository.TeacherRepository;
import com.teacher.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherRepository repository;
	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return repository.save(teacher);
	}

}
