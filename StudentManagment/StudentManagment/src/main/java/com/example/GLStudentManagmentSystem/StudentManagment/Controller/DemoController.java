package com.example.GLStudentManagmentSystem.StudentManagment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class DemoController {

	@GetMapping("/homepage")
	public String Homepage() {
		return "Demopage";
	}
}
