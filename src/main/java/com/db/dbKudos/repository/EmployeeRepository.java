package com.db.dbKudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.dbKudos.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
	
}
