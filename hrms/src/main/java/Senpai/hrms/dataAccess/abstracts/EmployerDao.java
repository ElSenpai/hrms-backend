package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

	
}
