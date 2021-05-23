package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.JobHunter;

public interface JobHunterDao extends JpaRepository<JobHunter,Integer> {

	
	JobHunter findBynationalIdentity(String nationalIdentity);
	
}
