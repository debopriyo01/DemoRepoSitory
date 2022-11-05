package com.example.GLStudentManagmentSystem.StudentManagment.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student_id")
	private int Student_Id;
	@Column(name = "First_Name")
	private String first_Name;
	@Column(name = "Last_Name")
	private String last_Name;
	@Column(name = "course")
	private String course;
	@Column(name = "country")
	private String country;

}
