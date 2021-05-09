package Senpai.hrms.business.abstracts;

import java.util.List;

import Senpai.hrms.entities.concretes.Employer;

public interface EmployerService {

	void add(Employer employer);
	void update(Employer employer);
	void delete(Employer employer);
	
	List<Employer> getAll();
	Employer get(int id);
}
