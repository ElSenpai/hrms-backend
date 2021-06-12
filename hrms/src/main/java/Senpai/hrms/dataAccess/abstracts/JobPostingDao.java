package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;


public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

	@Query("From JobPosting  where isActive=true ")
	List<JobPosting> getByIsActive();
	
	List<JobPosting> getAllByVerificationJobPostings_IsConfirmed(boolean confirmed );
	
	List<JobPosting> getByEmployerId(int employerId);

	
}
