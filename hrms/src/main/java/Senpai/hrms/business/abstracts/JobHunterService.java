package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.JobHunter;
import Senpai.hrms.entities.dto.CvDto;

public interface JobHunterService {

	Result add(JobHunter jobHunt);
	//Result update(JobHunter jobHunt);
	//Result delete(JobHunter jobHunt);
	
	DataResult<List<JobHunter>> getAll();
	DataResult<JobHunter> get(int id);
	DataResult<CvDto> getCv(int jobHunterId);
}
