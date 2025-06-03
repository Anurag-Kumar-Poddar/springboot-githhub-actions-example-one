package com.anurag.sprintgboot_github_actions;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
//	@Autowired
//	EmployeeRepository erepo;
	@RequestMapping("/test")
	public String test() {
		return "Test successfull.";
	}
	
//	@PostMapping("/save") 
//	public String save(@RequestBody Employee employee) {
//		erepo.save(employee);
//		return "data saved successfully";
//	}
//	
//	@GetMapping("/all")
//	public List<Employee> all() {
//		return erepo.findAll();
//	}
}
