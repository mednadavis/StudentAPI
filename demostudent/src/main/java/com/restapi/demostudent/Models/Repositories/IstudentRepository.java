package com.restapi.demostudent.Models.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.demostudent.Models.POJOS.Student;

@Repository
public interface IstudentRepository extends JpaRepository<Student, Integer> {
	// here all the rest api 5 methods will be created automatically

}
