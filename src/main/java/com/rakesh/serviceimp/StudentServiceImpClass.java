package com.rakesh.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.entity.Student;
import com.rakesh.repository.StudentRepository;
import com.rakesh.service.StudentService;
@Service
public class StudentServiceImpClass implements StudentService{

	@Autowired
	StudentRepository repository;  // inject
	
	@Override
	public List<Student> getAllStudents() {
		
		//return repository.findAll(); // directly return
		List<Student> list = repository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		repository.deleteById(id);
	}
}
