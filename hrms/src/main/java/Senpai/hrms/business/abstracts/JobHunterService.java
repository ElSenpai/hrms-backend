package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.entities.concretes.JobHunter;

public interface JobHunterService {

	void add(JobHunter jobHunt);
	void update(JobHunter jobHunt);
	void delete(JobHunter jobHunt);
	
	List<JobHunter> getAll();
	JobHunter get(int id);
}
