package Senpai.hrms.business.abstracts;

import Senpai.hrms.core.utilities.results.DataResult;

import Senpai.hrms.entities.concretes.Employer;
import Senpai.hrms.entities.concretes.JobHunter;


public interface AuthService {

	DataResult<JobHunter> registerJobHunter(JobHunter jobHunter,String confirmPassword);
	DataResult<Employer> registerEmployer(Employer employer,String confirmPassword);
	
	
}
