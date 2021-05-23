package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmployerService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.ErrorResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.EmployerDao;
import Senpai.hrms.entities.concretes.Employer;
import Senpai.hrms.entities.concretes.Job;
@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
    @Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		
		if(this.checkEmailExist(employer.getEmail()).getData() !=null) {
			
			return new ErrorResult("Email exist");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("Employer Added!");
	}

//	@Override
//	public Result update(Employer employer) {
//		this.employerDao.save(employer);
//		return new SuccessResult("Employer Updated!");
//	}
//
//	@Override
//	public Result delete(Employer employer) {
//		this.employerDao.delete(employer);
//		return new SuccessResult("Employer Deleted!");
//	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employer Listed");
	}

//	@Override
//	public DataResult<Employer> get(int id) {
//		
//		return new SuccessDataResult<Employer>( this.employerDao.findById(id).get());
//	}
    private DataResult<Employer> checkEmailExist(String email) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
		
	}

}
