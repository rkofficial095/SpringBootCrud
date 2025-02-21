package com.rakesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rakesh.entity.Student;
import com.rakesh.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/home")
	public String home()
	{
		return "home"; // view page html file -> home.html
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model)
	{
		model.addAttribute("students", service.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentsForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("students", student);
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		service.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model)
	{
		model.addAttribute("student", service.getById(id));
		return "edit-student";
	}
	
	@PostMapping("/students/edit/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student)
	{
		Student exStudent = service.getById(id);
		
		exStudent.setName(student.getName());
		exStudent.setEmail(student.getEmail());
		exStudent.setMobile(student.getMobile());
		exStudent.setGender(student.getGender());
		exStudent.setAddress(student.getAddress());
		exStudent.setCountry(student.getCountry());
		exStudent.setCourses(student.getCourses());
		exStudent.setPassword(student.getPassword());
		
		service.saveStudent(exStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		
		service.deleteById(id);
		return "redirect:/students";
		
	}
}
