package Senpai.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.JobHunterService;
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
	
	@PostMapping("/add")
	public void add(@RequestBody JobHunter jobHunt) {
		this.jobHuntService.add(jobHunt);
	}
	@PostMapping("/update")
	public void update(@RequestBody JobHunter jobHunt) {
		this.jobHuntService.update(jobHunt);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody JobHunter jobHunt) {
		this.jobHuntService.delete(jobHunt);
	}
	@GetMapping("/getall")
	public List<JobHunter> getAll(){
		return this.jobHuntService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public JobHunter get(@PathVariable("id")int id){
		return this.jobHuntService.get(id);
	}

}
