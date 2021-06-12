package Senpai.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.EmploymentTypeService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.entities.concretes.EmploymentType;


@RestController
@RequestMapping("/api/employmentTypes")
@CrossOrigin
public class EmploymentTypesController {
	
	private EmploymentTypeService employmentType;
	
	@Autowired
	public EmploymentTypesController(EmploymentTypeService employmentType) {
		this.employmentType=employmentType;
	}
	
	@GetMapping("/getall")
    public DataResult<List<EmploymentType>> getAll() {
        return this.employmentType.getAll();
    }

}
