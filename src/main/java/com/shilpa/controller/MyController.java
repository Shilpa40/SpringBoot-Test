package com.shilpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shilpa.model.Student;

@RestController
@RequestMapping("/students")
public class MyController {
	
	private static ArrayList<Student> students= getStudentList();
	private static int totalStudents= students.size();
	

	
	@GetMapping("/{rollCode}")
	public Student getStudents(@PathVariable Integer rollCode){
		
		return students.stream().filter(s-> s.getRollCode()==rollCode).findFirst().orElseGet(null);
	}
	
	@GetMapping("/")
	public List<Student> getStudents(){
		
		return students;
	}
	
	@PostMapping("/")
	public List<Student> getStudents(@RequestBody Student student){
		student.setRollCode(totalStudents+1);
		totalStudents = totalStudents+1;
		students.add(student);
		return students;
	}
	
	@PutMapping("/")
	public List<Student> updateStudent(@RequestBody Student student){
		
		List<Student> std =(ArrayList<Student>) students.stream().
				filter(s-> s.getRollCode()==student.getRollCode()).
				map(s-> student).collect(Collectors.toList());
		if(std.isEmpty()) {
			return null;
		}
		return std;
	}
	
	@DeleteMapping("/{rollCode}")
	public List<Student> deleteStudent(@PathVariable Integer rollCode){
		
		students.removeIf(s->s.getRollCode()==rollCode);
		 return students;
	}
	

	private static ArrayList<Student> getStudentList(){
		ArrayList<Student> students= new ArrayList<>();
		students.add(new Student(1,"Shilpa","Bain","Chandigarh"));
		students.add(new Student(2,"Subham","Gorlewar","Pune"));
		students.add(new Student(3,"Rajat","Goel","Mumbai"));
		return students;
	}

}
