package Senpai.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.CoverLetterService;

import Senpai.hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

	private CoverLetterService letterService;

	@Autowired
	public CoverLettersController(CoverLetterService letterService) {
		super();
		this.letterService = letterService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody CoverLetter letter )
    {
    	return ResponseEntity.ok(this.letterService.add(letter));
    }
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.letterService.getAll());
	}
	
}
