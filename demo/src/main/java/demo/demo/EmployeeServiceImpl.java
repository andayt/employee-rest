package demo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import demo.demo.domain.Employee;

@Service
public class EmployeeServiceImpl {
	
	private List<Employee> internalList = new ArrayList<>();

	public void saveEmployee(Employee employee) {
		internalList.add(employee);
	}
	
	public List<Employee> getEmployeesByGender(String empGender){
		return internalList.stream().filter(e -> empGender.equalsIgnoreCase(e.getEmpGender())).collect(Collectors.toList());
	}
}
