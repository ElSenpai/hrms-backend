package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmployeeService;
import Senpai.hrms.core.utilities.results.DataResult;
import Senpai.hrms.core.utilities.results.SuccessDataResult;
import Senpai.hrms.dataAccess.abstracts.EmployeeDao;
import Senpai.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeedao;

	@Autowired
	public EmployeeManager(EmployeeDao employeedao) {
		super();
		this.employeedao = employeedao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeedao.findAll());
	}
	
	
}
