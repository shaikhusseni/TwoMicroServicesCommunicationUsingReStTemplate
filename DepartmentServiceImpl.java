package com.restemp.departmentservice.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restemp.departmentservice.entities.Department;
import com.restemp.departmentservice.repositories.DepartmeRepository;
import com.restemp.departmentservice.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements  DepartmentService{

	@Autowired
	private DepartmeRepository departmentRepository;

	
//	public DepartmentServiceImpl(DepartmeRepository departmentRepository) {
//		super();
//		this.departmentRepository = departmentRepository;
//	}

	@Override
	public Department saveDepartment(Department department) {
		
		return  departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		
		return    departmentRepository.findById(departmentId).get();
	    
	}

}
