package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
	//Result update(Employer employer);
	//Result delete(Employer employer);
	
	DataResult<List<Employer>> getAll();
	//DataResult<Employer> get(int id);
	
	
	
	
}
