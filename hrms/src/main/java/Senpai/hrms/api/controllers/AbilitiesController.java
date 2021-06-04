package Senpai.hrms.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Senpai.hrms.business.abstracts.AbilityService;
import Senpai.hrms.core.utilities.results.ErrorDataResult;
import Senpai.hrms.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities")
public class AbilitiesController {

	
	private AbilityService abilityService;
	
    @Autowired
	public AbilitiesController(AbilityService abilityService) {
		super();
		this.abilityService = abilityService;
	}
    
    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Ability ability)
    {
    	return ResponseEntity.ok(this.abilityService.add(ability));
    }
    
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.abilityService.getAll());
	}
	@GetMapping("/getbyjobhunter")
	public ResponseEntity<?> getByJobhunterId(int jobhunterId){
		return ResponseEntity.ok(this.abilityService.getByJobhunter(jobhunterId));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String, String> validationErrors=new HashMap<String,String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors= new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		
		return errors;
		
	}
}
