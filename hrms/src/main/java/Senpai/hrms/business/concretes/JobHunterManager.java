package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.JobHunterService;
import Senpai.hrms.dataAccess.abstracts.JobHunterDao;
import Senpai.hrms.entities.concretes.JobHunter;
@Service
public class JobHunterManager implements JobHunterService {
	
	private JobHunterDao jobHunterDao;

	@Autowired
	public JobHunterManager(JobHunterDao jobHunterDao) {
		super();
		this.jobHunterDao = jobHunterDao;
	}

	@Override
	public void add(JobHunter jobHunt) {
        this.jobHunterDao.save(jobHunt);
		
	}

	@Override
	public void update(JobHunter jobHunt) {
		this.jobHunterDao.save(jobHunt);
		
	}

	@Override
	public void delete(JobHunter jobHunt) {
		this.jobHunterDao.delete(jobHunt);
		
	}

	@Override
	public List<JobHunter> getAll() {
		// TODO Auto-generated method stub
		return this.jobHunterDao.findAll();
	}

	@Override
	public JobHunter get(int id) {
		// TODO Auto-generated method stub
		return this.jobHunterDao.findById(id).get();
	}

}
