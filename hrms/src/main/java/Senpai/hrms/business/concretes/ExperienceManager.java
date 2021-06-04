package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.ExperienceService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.ExperienceDao;
import Senpai.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experiencedao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experiencedao) {
		super();
		this.experiencedao = experiencedao;
	}

	@Override
	public Result add(Experience exp) {
		this.experiencedao.save(exp);
		return new SuccessResult("exp added!");
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Experience>>(this.experiencedao.findAll(),"exps listed");
	}

	@Override
	public DataResult<List<Experience>> getByJobhunterOrderByLeaveDateDesc(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Experience>>(this.experiencedao.getByJobhunter_userIdOrderByLeaveDateDesc(jobHunterId));
	}

}
