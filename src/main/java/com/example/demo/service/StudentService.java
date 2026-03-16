package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repositery.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	public Student getStudent(int roll, String name, int age, String email)
	{
		Student st = new Student(roll, name, age, email);
		return studentRepo.save(st);
	}
}
