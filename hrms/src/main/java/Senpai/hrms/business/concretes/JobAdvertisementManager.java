package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.JobAdvertisementService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.JobAdvertisementDao;
import Senpai.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao advertisement;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisement) {
		super();
		this.advertisement = advertisement;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisement.findAll());
	}

	@Override
	public Result add(JobAdvertisement advertisements) {
		this.advertisement.save(advertisements);
		return new SuccessResult("Job advertisements added!");
	}

	@Override
	public Result update(JobAdvertisement advertisements) {
		this.advertisement.save(advertisements);
		return new SuccessResult("Job advertisements updated!");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByActive() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisement.getByIsActive());
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"appDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisement.findAll(sort));
	}

}
