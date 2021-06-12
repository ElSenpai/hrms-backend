package Senpai.hrms.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.VerificationJobPostingService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;

import Senpai.hrms.entities.concretes.VerificationJobPosting;

@RestController
@RequestMapping("/api/verifications")
@CrossOrigin
public class VerificationsController {
	
	private VerificationJobPostingService verifiy;

	@Autowired
	public VerificationsController(VerificationJobPostingService verifiy) {
		super();
		this.verifiy = verifiy;
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody VerificationJobPosting job) {
	return	this.verifiy.verify(job);
		
	}
	@GetMapping("/getallconfirmed")
	public DataResult<List<VerificationJobPosting>> getall(){
		return this.verifiy.getAllConfirmed();
	}
}
