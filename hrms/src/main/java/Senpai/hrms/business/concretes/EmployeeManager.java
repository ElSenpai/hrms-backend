package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmployeeService;
import Senpai.hrms.business.abstracts.PostingStatusService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.Result;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.core.utilities.results.SuccessResult;
import Senpai.hrms.dataAccess.abstracts.EmployeeDao;
import Senpai.hrms.entities.concretes.Employee;
import Senpai.hrms.entities.concretes.PostingStatus;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeedao;
	private PostingStatusService statusService;

	@Autowired
	public EmployeeManager(EmployeeDao employeedao,PostingStatusService statusService) {
		super();
		this.employeedao = employeedao;
		this.statusService=statusService;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeedao.findAll());
	}

	@Override
	public Result confirm(PostingStatus status) {
		
		this.statusService.add(status);
		return new SuccessResult("Posting Confirmed");
	}
	
	
}
