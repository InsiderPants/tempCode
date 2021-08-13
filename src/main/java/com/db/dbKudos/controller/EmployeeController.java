package com.db.dbKudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.dbKudos.model.Employee;
import com.db.dbKudos.model.requestData.EmailData;
import com.db.dbKudos.model.requestData.LoginData;
import com.db.dbKudos.model.responseData.DataResponse;
import com.db.dbKudos.model.responseData.Response;
import com.db.dbKudos.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAll")
	private List<Employee> getAllEmployees() {
		
		List<Employee> ret = employeeService.getAllEmployees();
		
		return ret;
		
	}
	
	@PostMapping("/addEmployee")
	private void addEmployee(@RequestBody Employee employee) { 
		
		employeeService.addEmployee(employee);
		
	}
	
	// Actual
	@PostMapping("/getData")
	private ResponseEntity<Response> getEmployeeData(@RequestBody EmailData email) {
		
		System.out.println(email.getEmail());
		Employee ret = employeeService.getEmployeeData(email.getEmail());
		
		Response response = new DataResponse<Employee>(true, ret);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "Sample Header");
		
//		return ResponseEntity.status(HttpStatus.OK).headers(header).body(response);
		return ResponseEntity.ok().body(response);
	}
}
