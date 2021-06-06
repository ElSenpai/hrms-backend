package Senpai.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.LanguageService;
import Senpai.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
@CrossOrigin
public class LanguagesController {

	private LanguageService languageService;
     @Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
     
     @PostMapping("/add")
     public ResponseEntity<?> add(@RequestBody  Language language )
     {
         return ResponseEntity.ok(this.languageService.add(language));
     }
     
     @GetMapping("/getall")
     public ResponseEntity<?> getAll(){
         
         return ResponseEntity.ok(this.languageService.getAll());
     }
}
