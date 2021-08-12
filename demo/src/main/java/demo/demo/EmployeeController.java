package demo.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.demo.domain.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@PostMapping("/emp")
	public ResponseEntity<String> postEmployee(@RequestBody Employee employee) {
		employeeServiceImpl.saveEmployee(employee);
		return new ResponseEntity<String>("Employee Posted!", HttpStatus.OK);
	}

	@GetMapping("/emp/{empGender}")
	public ResponseEntity<List<Employee>> getEmployeesByGender(@PathVariable("empGender") String empGender) {
		return new ResponseEntity<List<Employee>>(employeeServiceImpl.getEmployeesByGender(empGender), HttpStatus.OK);
	}
}
