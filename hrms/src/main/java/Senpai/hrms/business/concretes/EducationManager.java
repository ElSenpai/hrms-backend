package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EducationService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.EducationDao;
import Senpai.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationdao;
	
	@Autowired
	public EducationManager(EducationDao educationdao) {
		super();
		this.educationdao = educationdao;
	}

	@Override
	public Result add(Education education) {
		this.educationdao.save(education);
		return new SuccessResult("education added");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationdao.findAll(),"educations listed");
	}

	@Override
	public DataResult<List<Education>> getByJobhunterOrderByGraduationDateDesc(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationdao.getByJobhunter_userIdOrderByGraduationDateDesc(jobHunterId));
	}

}
