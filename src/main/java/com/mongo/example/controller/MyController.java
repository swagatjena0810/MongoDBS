/*package com.mongo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.entities.Student;
import com.mongo.example.repository.StudentRepository;

@RestController
@RequestMapping
public class MyController {
	
	@Autowired
	private StudentRepository studentrepo;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student s=this.studentrepo.save(student);
		return ResponseEntity.ok(s);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.studentrepo.findAll());	}

}
*/