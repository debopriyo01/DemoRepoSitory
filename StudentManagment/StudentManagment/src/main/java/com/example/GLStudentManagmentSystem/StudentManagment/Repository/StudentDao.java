package com.example.GLStudentManagmentSystem.StudentManagment.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.GLStudentManagmentSystem.StudentManagment.Model.Student;

@Repository
public interface StudentDao {

	/**
	 * Find all methode ,Save and Save or Update Methode:-
	 */
	public List<Student> FindAll();

	public void save(Student student);

	public void saveorUpdate(Student student);
}
