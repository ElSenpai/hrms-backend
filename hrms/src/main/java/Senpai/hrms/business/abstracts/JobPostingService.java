package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;



public interface JobPostingService {

	DataResult<List<JobPosting>> getAll();
	DataResult<List<JobPosting>> getAllConfirmed(String status);
	DataResult<List<JobPosting>> getAllSortedByDate();
	DataResult<List<JobPosting>> getByEmloyerId(int employerId);
	Result add(JobPosting advertisement);
	Result update(JobPosting advertisement);
	
	DataResult<List<JobPosting>> yanbal(String status);
}
