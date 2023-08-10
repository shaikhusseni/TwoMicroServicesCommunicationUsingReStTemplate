package com.restemp.departmentservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restemp.departmentservice.entities.Department;

public interface DepartmeRepository extends JpaRepository<Department, Long>{

}
