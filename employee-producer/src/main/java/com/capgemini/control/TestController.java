package com.capgemini.control;





import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Employee;





@RestController
public class TestController {
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public Employee firstPage()
	{
		Employee emp=new Employee("1","Manager","Loki",5000);
		return emp;
	}

}

