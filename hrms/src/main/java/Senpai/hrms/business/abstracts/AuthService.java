package Senpai.hrms.business.abstracts;

import Senpai.hrms.entities.concretes.JobHunter;

public interface AuthService {

	void register (JobHunter jobHunt,String confirmPass);
	void login (JobHunter jobHunt);
}
