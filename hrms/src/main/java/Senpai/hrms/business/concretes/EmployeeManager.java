package Senpai.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Senpai.hrms.business.abstracts.EmployeeService;
import Senpai.hrms.dataAccess.abstracts.EmployeeDao;
import Senpai.hrms.entities.concretes.Employee;
@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeDao) {
		super();
		this.employeDao = employeDao;
	}

	@Override
	public void add(Employee employee) {
		this.employeDao.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		this.employeDao.save(employee);
		
	}

	@Override
	public void delete(Employee employee) {
		this.employeDao.delete(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeDao.findAll();
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return this.employeDao.findById(id).get();
	}

}
