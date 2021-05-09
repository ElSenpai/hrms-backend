package Senpai.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.JobService;
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
	public void add(@RequestBody Job job) {
		this.jobService.add(job);
	}
	@PostMapping("/update")
	public void update(@RequestBody Job job) {
		this.jobService.update(job);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Job job) {
		this.jobService.delete(job);
	}
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Job get(@PathVariable("id") int id){
		return this.jobService.get(id);
	}

}
