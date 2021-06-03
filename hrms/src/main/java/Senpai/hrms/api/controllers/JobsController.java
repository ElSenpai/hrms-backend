package Senpai.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.JobService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;

import Senpai.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Job job) {
	return	this.jobService.add(job);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	

}
