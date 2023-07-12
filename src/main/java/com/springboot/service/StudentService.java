package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.data.Student;
import com.springboot.data.StudentRepository;

@Service
public class StudentService {

	StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public Student getStudent(Long id) {
		return studentRepository.findById(id).orElseThrow(IllegalStateException::new);
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Long id, Student other) {
		Student student = studentRepository.findById(id).orElseThrow(IllegalStateException::new);
		student.setName(other.getName());
		student.setEmail(other.getEmail());
		return student;
	}
	
	public Long deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return id;
	}
}
