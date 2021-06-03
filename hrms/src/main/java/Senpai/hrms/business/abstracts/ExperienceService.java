package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Experience;

public interface ExperienceService {

	Result add(Experience exp);
	
	DataResult<List<Experience>> getAll();
}
