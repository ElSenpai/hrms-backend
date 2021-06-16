package Senpai.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.PostingStatusService;

@RestController
@RequestMapping("/api/statuses")
@CrossOrigin
public class PostingStatusesController {
	
	private PostingStatusService postingStatusService;

	@Autowired
	public PostingStatusesController(PostingStatusService postingStatusService) {
		super();
		this.postingStatusService = postingStatusService;
	}
	

	 @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        
	        return ResponseEntity.ok(this.postingStatusService.getAll());
	    }
}
