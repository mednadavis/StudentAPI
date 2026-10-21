package com.restapi.demostudent.Models.BAO.Services;

import java.util.List;

import com.restapi.demostudent.Models.POJOS.Student;

public interface IstudentBAO {
	
	List<Student> getAll();
	Student getById(int id);
	String insertStudent(Student S);
	String updateStudent(Student S);
	String deleteStudent(int id);
	

}
