package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmployerService;
import Senpai.hrms.dataAccess.abstracts.EmployerDao;
import Senpai.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	
    @Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
		
	}

	@Override
	public void update(Employer employer) {
		this.employerDao.save(employer);
		
	}

	@Override
	public void delete(Employer employer) {
		this.employerDao.delete(employer);
		
	}

	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll();
	}

	@Override
	public Employer get(int id) {
		
		return this.employerDao.findById(id).get();
	}

}
