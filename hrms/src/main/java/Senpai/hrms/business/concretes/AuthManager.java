package Senpai.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.AuthService;
import Senpai.hrms.business.abstracts.EmployerService;
import Senpai.hrms.business.abstracts.JobHunterService;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.ErrorDataResult;
import Senpai.hrms.core.utilities.results.ErrorResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;

import Senpai.hrms.entities.concretes.Employer;
import Senpai.hrms.entities.concretes.JobHunter;

@Service
public class AuthManager implements AuthService {
	
	private JobHunterService jobHunterService;
	private EmployerService employerService;
	
	
    @Autowired
	public AuthManager(JobHunterService jobHunterService,EmployerService employerService) {
		super();
		this.jobHunterService = jobHunterService;
		this.employerService=employerService;
		
	}

	@Override
	public DataResult<JobHunter> registerJobHunter(JobHunter jobHunter, String confirmPassword) {
		
		
		
		if(this.confirmPass(jobHunter.getPassword(), confirmPassword).isSuccess() )
		{
			
			
			var register=this.jobHunterService.add(jobHunter);
			return new SuccessDataResult<JobHunter>(register.getMessage());
		}
		return new ErrorDataResult<JobHunter>("register failed");
		
		
	}

	@Override
	public DataResult<Employer> registerEmployer(Employer employer, String confirmPassword) {
		
		if(this.confirmPass(employer.getPassword(), confirmPassword).isSuccess()) {
			if(this.checkEmailDomain(employer.getEmail(), employer.getWebsite()).isSuccess()) {
				
			   this.employerService.add(employer);
			   return new SuccessDataResult<Employer>(employer,"Register Success");
			}
			return new ErrorDataResult<Employer>(employer,"Domain not match");
			
		}
		return new ErrorDataResult<Employer>("register failed");
	}
	
	
	private Result confirmPass(String password,String confirmPassword) 
	{	
		
		if (password.equals(confirmPassword)) {
			
			return new SuccessResult("Password Match!");
		}
		return new ErrorResult("Password not match!");
	
	}
	
	private Result checkEmailDomain(String email,String website) {
		
		String[] mail=email.split("@",2);
		String web=website.substring(4);
		if(mail[1].equals(web)) {
			return new SuccessResult("Domain Match");
		}
		return new ErrorResult("Domain not match");
	}
 
 
	

	
	
	

}
