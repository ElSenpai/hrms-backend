package Senpai.hrms.business.abstracts;

import java.util.List;


import Senpai.hrms.entities.concretes.Job;

public interface JobService {

	void add(Job job);
	void update(Job job);
	void delete(Job job);
	
	List<Job> getAll();
	Job get(int id);
}
