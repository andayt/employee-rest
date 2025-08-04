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
        internalList.add(new Employee("Alice", 8000, "Female"));
        internalList.add(new Employee("Bob", 6500, "Male"));       
        internalList.add(new Employee("Diana", 6900, "Female"));
    }
	
	public List<Employee> getEmployeesByGender(String empGender){
		return internalList.stream().filter(e -> empGender.equalsIgnoreCase(e.getGender())).collect(Collectors.toList());
	}
	public List<String> getHighEarners() {
        return internalList.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
	
}
