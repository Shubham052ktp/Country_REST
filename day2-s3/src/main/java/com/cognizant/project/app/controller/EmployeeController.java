package com.cognizant.project.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.project.app.model.Employee;
import com.cognizant.project.app.service.EmployeeServiceI;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI employeeService;
	
	@ApiOperation("Posting the employee")
	@PostMapping(value="/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
		return new ResponseEntity<>("Employee added successfully",HttpStatus.OK);
	}
	
	@ApiOperation("Updating the employee")
	@PutMapping(value="/updateEmployee")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		employeeService.updateEmployee(employee);
		return new ResponseEntity<>("Employee details updated successfully",HttpStatus.OK);
	}
	
	@ApiOperation("Deleting the employee")
	@DeleteMapping(value="/deleteEmployee")
	public ResponseEntity<String> deleteEmployee(@RequestBody Employee employee){
		employeeService.deleteEmployee(employee);
		return new ResponseEntity<>("Employee deatials deleted successfully",HttpStatus.OK);
	}
	
	@ApiOperation("Get all the employee")
	@GetMapping(value="/getEmployee")
	public ResponseEntity<String> getEmployee(@RequestBody Employee employee){
		employeeService.getEmployee(employee);
		return new ResponseEntity<>("All Employee Details",HttpStatus.OK);
	}

}
