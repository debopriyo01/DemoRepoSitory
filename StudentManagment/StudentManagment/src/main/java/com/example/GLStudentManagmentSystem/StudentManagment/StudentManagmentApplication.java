package com.example.GLStudentManagmentSystem.StudentManagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.GLStudentManagmentSystem.StudentManagment.Controller.DemoController;

@SpringBootApplication(scanBasePackages = {"com.example.GLStudentManagmentSystem.StudentManagment.Controller","com.example.GLStudentManagmentSystem.StudentManagment.Model","com.example.GLStudentManagmentSystem.StudentManagment.Repository","com.example.GLStudentManagmentSystem.StudentManagment.service"})
public class StudentManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
		System.out.println("Hallow Spring Boot");
	}

}
