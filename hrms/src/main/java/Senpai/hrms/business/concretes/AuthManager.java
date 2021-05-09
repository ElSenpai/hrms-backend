package Senpai.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.AuthService;
import Senpai.hrms.business.abstracts.JobHunterService;
import Senpai.hrms.entities.concretes.JobHunter;
@Service
public class AuthManager implements AuthService {
	
	private JobHunterService jobHunterService;
	
    @Autowired
	public AuthManager(JobHunterService jobHunterService) {
		super();
		this.jobHunterService = jobHunterService;
	}

	@Override
	public void register(JobHunter jobHunt, String confirmPass) {
		
		if(jobHunt.getEmail()==confirmPass) {
			this.jobHunterService.add(jobHunt);
		} else {
			System.out.println("password did not match!");
		}
		
	}

	@Override
	public void login(JobHunter jobHunt) {
		//after dto
		
	}
	
	

}
