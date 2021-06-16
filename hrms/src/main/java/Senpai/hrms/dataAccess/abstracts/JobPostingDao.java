package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;


public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

	@Query("From JobPosting  where isActive=true ")
	List<JobPosting> getByIsActive();
	
	List<JobPosting> getAllBypostingStatus_Status_Name(String status );
	
	List<JobPosting> getByEmployer_userId(int employerId);

	@Query("From JobPosting jp " +
            "inner join jp.postingStatus jps " +
            "left join jps.status status " +
            "where jps.id in " +
            "(select MAX(jps.id) from JobPosting jp join jp.postingStatus jps group by jp.id) " +
            "and status.name = :status")
	List<JobPosting> yanbal(String status);
	
}
