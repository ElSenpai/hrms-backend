package Senpai.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.EmployeeService;
import Senpai.hrms.entities.concretes.Employee;


@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeService;
	@Autowired
	public EmployeesController(EmployeeService employeService) {
		super();
		this.employeService = employeService;
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody Employee Employee) {
	this.employeService.add(Employee);	
	}
	@PostMapping("/update")
	public void update(@RequestBody Employee Employee) {
		this.employeService.update(Employee);		
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Employee Employee) {
		this.employeService.delete(Employee);	
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeService.getAll();	
	}
	
	@GetMapping("/get/{id}")
	public Employee  get(@PathVariable("id") int id){
		return this.employeService.get(id);	
	}

}
