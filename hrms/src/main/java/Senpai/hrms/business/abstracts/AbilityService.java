package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.entities.concretes.Ability;

public interface AbilityService {

	Result add(Ability ability);
		
	DataResult<List<Ability>> getAll();
	DataResult<List<Ability>> getByJobhunter(int JobHunterId);
}
