package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.JobHunterService;
import Senpai.hrms.business.abstracts.UserService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.ErrorResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.JobHunterDao;
import Senpai.hrms.entities.concretes.Job;
import Senpai.hrms.entities.concretes.JobHunter;
@Service
public class JobHunterManager implements JobHunterService {
	
	private JobHunterDao jobHunterDao;
	private UserService userService;

	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao,UserService userService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.userService=userService;
	}

	@Override
	public Result add(JobHunter jobHunt) {
		
		if((this.userService.checkEmail(jobHunt.getEmail()).getData() !=null )&&(this.checkTcExist(jobHunt.getNationalIdentity()).getData() !=null)) {
			
			return new ErrorResult("Mail or TcNo exist");
		}
		
		
        this.jobHunterDao.save(jobHunt);
              return new SuccessResult("Condidate Added");
		
	}

//	@Override
//	public Result update(JobHunter jobHunt) {
//		this.jobHunterDao.save(jobHunt);
//		return new SuccessResult("Condidate Updated");
//	}
//
//	@Override
//	public Result delete(JobHunter jobHunt) {
//		this.jobHunterDao.delete(jobHunt);
//		return new SuccessResult("Condidate Deleted");
//	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobHunter>>( this.jobHunterDao.findAll(),"Condidates Listed");
	}

//	@Override
//	public DataResult<JobHunter> get(int id) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<JobHunter>( this.jobHunterDao.findById(id).get());
//	}
    
   private DataResult<JobHunter> checkTcExist(String tcNo) {
	
	return new SuccessDataResult<JobHunter>(this.jobHunterDao.findBynationalIdentity(tcNo));
	
}

}
