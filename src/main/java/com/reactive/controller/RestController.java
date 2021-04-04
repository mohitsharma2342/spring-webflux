package com.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reactive.model.Employee;
import com.reactive.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
public class RestController {

	
	  private EmployeeRepository employeeRepository;


	    @GetMapping("/all")
	    public Flux<Employee> getAll() {
	        return employeeRepository
	                .findAll();
	    }

	    @GetMapping("/{id}")
	    public Mono<Employee> getId(@PathVariable("id") final String empId) {
	        return employeeRepository.findById(empId);
	    }
}
