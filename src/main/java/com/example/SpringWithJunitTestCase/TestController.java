package com.example.SpringWithJunitTestCase;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/employee")
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("anu");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}

    

