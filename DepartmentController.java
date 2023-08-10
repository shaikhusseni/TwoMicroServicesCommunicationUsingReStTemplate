package com.restemp.departmentservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restemp.departmentservice.entities.Department;
import com.restemp.departmentservice.services.DepartmentService;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

	
	 public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	 
	 
	private DepartmentService departmentService;

	    @PostMapping
	    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
	        Department savedDepartment = departmentService.saveDepartment(department);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	    @GetMapping("{id}")
	    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
	        Department department = departmentService.getDepartmentById(departmentId);
	        return ResponseEntity.ok(department);
	    }

	
	
	
	
	
	
}
