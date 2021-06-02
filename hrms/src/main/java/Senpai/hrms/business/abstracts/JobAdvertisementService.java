package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.JobAdvertisement;
import Senpai.hrms.entities.dto.AdvertisementDto;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<AdvertisementDto>> getAllDetail();
	DataResult<List<AdvertisementDto>> getAllByActive();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	Result add(JobAdvertisement advertisement);
	Result update(JobAdvertisement advertisement);
}
