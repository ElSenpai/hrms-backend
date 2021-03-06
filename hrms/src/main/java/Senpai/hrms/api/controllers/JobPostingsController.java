package Senpai.hrms.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.JobPostingService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;



@RestController
@RequestMapping("/api/jobpostings")
@CrossOrigin
public class JobPostingsController {

	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobPosting>> getAll() {
		return this.jobPostingService.getAll();
	}
	@GetMapping("/getallbydate")
	public DataResult<List<JobPosting>> getAllByDate() {
		return this.jobPostingService.getAllSortedByDate();
	}
	@GetMapping("/getallbystatus")
	public DataResult<List<JobPosting>> getAllByStatus(@RequestParam String status) {
		return this.jobPostingService.getAllConfirmed(status);
	}
	@GetMapping("/getallbyemployerid")
	public DataResult<List<JobPosting>> getAllByEmployerId(@RequestParam int employerId) {
		return this.jobPostingService.getByEmloyerId(employerId);
	}
	
	@PostMapping("/add")
	   public void add( @RequestBody JobPosting advertisement) {
		
		
	       this.jobPostingService.add(advertisement);
	  }
	    @PostMapping("/update")
	   public void update(@RequestBody JobPosting advertisement) {
	       this.jobPostingService.update(advertisement);
	    }
	    
	    @GetMapping("/yanbal")
		public ResponseEntity<?> test(String status){
			
			return ResponseEntity.ok(this.jobPostingService.yanbal(status));
		}
	    
	    
	    
	    
	
	
}
