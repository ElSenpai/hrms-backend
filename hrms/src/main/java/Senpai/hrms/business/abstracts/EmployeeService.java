package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.entities.concretes.Employee;

public interface EmployeeService {

	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	
	List<Employee> getAll();
	
	Employee get(int id);
}
