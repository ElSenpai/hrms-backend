package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.JobHunter;

public interface JobHunterService {

	Result add(JobHunter jobHunt);
	//Result update(JobHunter jobHunt);
	//Result delete(JobHunter jobHunt);
	
	DataResult<List<JobHunter>> getAll();
	//DataResult<JobHunter> get(int id);
}
