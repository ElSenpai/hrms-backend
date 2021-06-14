package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.JobPostingService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;

import Senpai.hrms.dataAccess.abstracts.JobPostingDao;
import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;



@Service
public class JobPostingManager implements JobPostingService {

	private JobPostingDao jobPosting;
	@Autowired
	public JobPostingManager(JobPostingDao jobPosting) {
		super();
		this.jobPosting = jobPosting;
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>(this.jobPosting.findAll());
	}

	@Override
	public Result add(JobPosting advertisements) {
		this.jobPosting.save(advertisements);
		return new SuccessResult("Job advertisements added!");
	}

	@Override
	public Result update(JobPosting advertisements) {
		this.jobPosting.save(advertisements);
		return new SuccessResult("Job advertisements updated!");
	}


	@Override
	public DataResult<List<JobPosting>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"appDeadline");
		return new SuccessDataResult<List<JobPosting>>(this.jobPosting.findAll(sort));
	}

	@Override
	public DataResult<List<JobPosting>> getAllConfirmed(boolean confirmed) {
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPosting.getAllByVerificationJobPostings_IsConfirmed(confirmed));
	}

	@Override
	public DataResult<List<JobPosting>> getByEmloyerId(int employerId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosting>>(this.jobPosting.getByEmployer_userId(employerId));
	}



}
