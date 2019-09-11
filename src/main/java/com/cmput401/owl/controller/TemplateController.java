package com.cmput401.owl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmput401.owl.model.Employee;

@RestController
public class TemplateController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		return employeesList;
    }

}
