package com.restemp.departmentservice.services;

import com.restemp.departmentservice.entities.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
	
	
	
	

