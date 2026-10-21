package com.restapi.demostudent.Models.BAO.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.demostudent.Models.BAO.Services.IstudentBAO;
import com.restapi.demostudent.Models.POJOS.Student;
import com.restapi.demostudent.Models.Repositories.IstudentRepository;

@Service
public class StudentBAO implements IstudentBAO {
	
	
    @Autowired
	IstudentRepository studentrepo;
    
	@Override
	public List<Student> getAll() {
		
		return studentrepo.findAll();
	}

	@Override
	public Student getById(int id) {
		
		// Optional<Student> s= studentrepo.findById(null);
		Student s= studentrepo.findById(id).get();
		
		return s ;
	}

	@Override
	public String insertStudent(Student S) {
		studentrepo.save(S);
		return "Student record Saved succesfully";
	}

	@Override
	public String updateStudent(Student S) {
		
		  Optional<Student> old=studentrepo.findById(S.getStudentid());
		 if( old.isPresent()) {
			 old.get().setStudentcoursename(S.getStudentcoursename());
			 studentrepo.save(old.get());
			 return "Student course name updated succesfully";
		 }
		 else {
			 return"Failed to update";
		 }
		 
		  
		
	}

	@Override
	public String deleteStudent(int id) {
		 Optional<Student> old=studentrepo.findById(id);
		 if(old.isPresent()) {
			 studentrepo.delete(old.get());
			 return "Student Successfully deleted";
		 }
		 else {
			 return "Student not found";
		 }
	}
	
	
	

}
