package Senpai.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.EmployeeService;
import Senpai.hrms.entities.concretes.PostingStatus;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
public class EmployeesController {

	private EmployeeService employeService;

	@Autowired
	public EmployeesController(EmployeeService employeService) {
		super();
		this.employeService = employeService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.employeService.getAll());
	}
	@PostMapping("/confirm")
	public ResponseEntity<?> confirm(@RequestBody PostingStatus status ){
		return ResponseEntity.ok(this.employeService.confirm(status));
	}
  
}
