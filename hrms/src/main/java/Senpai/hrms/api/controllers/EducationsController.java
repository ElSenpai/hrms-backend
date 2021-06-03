package Senpai.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.EducationService;
import Senpai.hrms.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {

	private EducationService educationService;

	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Education education )
    {
        return ResponseEntity.ok(this.educationService.add(education));
    }
    
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        
        return ResponseEntity.ok(this.educationService.getAll());
    }
}
