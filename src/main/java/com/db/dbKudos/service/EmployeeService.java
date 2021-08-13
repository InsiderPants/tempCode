package com.db.dbKudos.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.dbKudos.model.Employee;
import com.db.dbKudos.model.requestData.LoginData;
import com.db.dbKudos.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployee = new ArrayList<Employee>();
		
		employeeRepository.findAll().forEach(employee -> allEmployee.add(employee));
		
		return allEmployee;
	}
	
	public void addEmployee(Employee employee) {
		
		Employee t = employeeRepository.save(employee);
		System.out.println(t.toString());
	}
	
	public Employee getEmployeeData(String email) {
		
		Employee employee = null;
		try {
			employee = employeeRepository.getById(email);
			System.out.println("here 0");
		}
		catch(EntityNotFoundException e)
		{
			System.out.println("here");
		}
		catch(Exception e)
		{
			
			System.out.println("here2");
		}
		return employee;
		
	}
}
