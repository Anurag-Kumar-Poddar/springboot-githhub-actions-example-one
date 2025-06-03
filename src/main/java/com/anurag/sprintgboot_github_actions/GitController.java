package com.anurag.sprintgboot_github_actions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
	@RequestMapping("/test")
	public String test() {
		return "Test successfull.";
	}
}
