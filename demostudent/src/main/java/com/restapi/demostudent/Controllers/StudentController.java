package com.restapi.demostudent.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demostudent.Models.BAO.Services.IstudentBAO;
import com.restapi.demostudent.Models.POJOS.Student;

@RestController
@RequestMapping("std")
public class StudentController {
	
	IstudentBAO studBAO;
	
	@GetMapping("getall")
	public List<Student> getallStudents(){
		
		return studBAO.getAll();
		
	}
	
	@GetMapping("getbyid/{id}")
	public Student getByIdStudent(@PathVariable("id") int id) {
		
		return studBAO.getById(id);
	}
	
	@PostMapping ("insert")
	public String insertStudent(@RequestBody Student s) {
		
		return studBAO.insertStudent(s);
		
	}
	
	@PutMapping ("update")
	public String updateStudent(@RequestBody Student s) {
		
		return studBAO.updateStudent(s);
		
	}
	
	@DeleteMapping ("delete")
	public String updateStudent(@RequestParam int id) {
		
		return studBAO.deleteStudent(id);
		
	}
	
	
	
	

}
