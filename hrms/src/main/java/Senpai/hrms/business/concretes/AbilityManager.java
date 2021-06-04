package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.AbilityService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.AbilityDao;
import Senpai.hrms.entities.concretes.Ability;

@Service
public class AbilityManager implements AbilityService {

	private AbilityDao abilitydao;

	@Autowired
	public AbilityManager(AbilityDao abilitydao) {
		super();
		this.abilitydao = abilitydao;
	}

	@Override
	public Result add(Ability ability) {
		this.abilitydao.save(ability);
		return new SuccessResult("ability added");
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Ability>>(this.abilitydao.findAll(),"abilities listed");
	}

	

	@Override
	public DataResult<List<Ability>> getByJobhunter(int JobHunterId) {
		
		return new SuccessDataResult<List<Ability>>(this.abilitydao.getByJobhunter_userId(JobHunterId));
	}
}
