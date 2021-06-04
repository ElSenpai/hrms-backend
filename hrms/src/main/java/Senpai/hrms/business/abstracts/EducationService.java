package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Education;

public interface EducationService {

	Result add(Education education);
	
	DataResult<List<Education>> getAll();
	DataResult<List<Education>>getByJobhunterOrderByGraduationDateDesc(int jobHunterId);
	
}
