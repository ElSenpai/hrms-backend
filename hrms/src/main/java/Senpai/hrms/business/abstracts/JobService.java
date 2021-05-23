package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	//Result update(Job job);
	//Result delete(Job job);
	
	DataResult<List<Job>> getAll();
	//DataResult<Job> get(int id);
}
