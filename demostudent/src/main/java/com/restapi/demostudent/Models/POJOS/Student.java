package com.restapi.demostudent.Models.POJOS;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="sivadstudent")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {
	
	@Id
	private int studentid;
	@Column(length = 25)
	private String studentname;
	private LocalDate studentdob;
	private LocalDate studentdoj;
	@Column(length=25)
	private String studentcoursename;
	
	

}
