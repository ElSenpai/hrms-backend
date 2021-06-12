package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmploymentTypeService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.dataAccess.abstracts.EmploymentTypeDao;
import Senpai.hrms.entities.concretes.EmploymentType;
@Service
public class EmploymentTypeManager implements EmploymentTypeService {

	private EmploymentTypeDao employmentDao;
	
	
	@Autowired
	public EmploymentTypeManager(EmploymentTypeDao employmentDao) {
		super();
		this.employmentDao = employmentDao;
	}



	@Override
	public DataResult<List<EmploymentType>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<EmploymentType>>(this.employmentDao.findAll());
	}

}
