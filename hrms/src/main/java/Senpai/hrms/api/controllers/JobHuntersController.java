package Senpai.hrms.api.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.JobHunterService;
import Senpai.hrms.core.utilities.results.DataResult;

import Senpai.hrms.entities.concretes.JobHunter;

@RestController
@RequestMapping("/api/jobhunters")
public class JobHuntersController {
	
	private JobHunterService jobHuntService;
	@Autowired
	public JobHuntersController(JobHunterService jobHuntService) {
		super();
		this.jobHuntService = jobHuntService;
	}
	
	

	@GetMapping("/getall")
	public DataResult<List<JobHunter>> getAll(){
		return this.jobHuntService.getAll();
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add (@Valid @RequestBody JobHunter hunter){
		
		return ResponseEntity.ok(this.jobHuntService.add(hunter));
	}
	
	@GetMapping("/cv")
	public ResponseEntity<?> getCv(@RequestParam int jobHunterId){
		return ResponseEntity.ok(this.jobHuntService.getCv(jobHunterId));
	}

}
