package com.example.GLStudentManagmentSystem.StudentManagment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/list")
	public String StduentList() {
		return "Student_List";
	}
}
