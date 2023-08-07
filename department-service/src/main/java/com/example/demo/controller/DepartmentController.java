package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/departments")
@AllArgsConstructor
public class DepartmentController {

	private final DepartmentService departmentService;

	private final Environment environment;

	@GetMapping("/status")
	public String status() {
		return "department-service is up and runing on port" + environment.getProperty("local.server.port");
	}

	@GetMapping("/{departmentName}")
	public Department findByName(@PathVariable("departmentName") String departmentName) {
		return departmentService.findDepartmentByName(departmentName);
	}

}