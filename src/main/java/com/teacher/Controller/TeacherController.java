package com.teacher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.Service.TeacherService;
import com.teacher.entity.Teacher;

@RestController
@RequestMapping("/")
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@PostMapping("saveteacher")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		
		Teacher saveTeacher = teacherService.saveTeacher(teacher);
		return new ResponseEntity<>(saveTeacher, HttpStatus.OK);
	}
	
}
