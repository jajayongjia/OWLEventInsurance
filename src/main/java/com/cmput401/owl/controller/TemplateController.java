package com.cmput401.owl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmput401.owl.model.Employee;
import com.cmput401.owl.model.EventType;
import com.cmput401.owl.service.ApplicationService;

@RestController
public class TemplateController {
	
	@Autowired ApplicationService applicationService;
	
	@RequestMapping("/")
    public List<EventType> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		return applicationService.getAllEventType();
    }

}
