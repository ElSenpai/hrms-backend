package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import Senpai.hrms.entities.concretes.JobPosting;
import Senpai.hrms.entities.dto.JobPostingDto;


public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

	@Query("From JobAdvertisement where isActive=true ")
	List<JobPosting> getByIsActive();
	
	@Query("Select new Senpai.hrms.entities.dto.JobPostingDto(j.id, e.companyName,j.openPositions,j.appDate,j.appDeadline,j.isActive) From Employer e Inner Join e.jobAdvertisement j ")
	List<JobPostingDto> getByAdvertisementDetail();
	
	@Query("Select new Senpai.hrms.entities.dto.JobPostingDto(j.id, e.companyName,j.openPositions,j.appDate,j.appDeadline,j.isActive) From Employer e Inner Join e.jobAdvertisement j Where j.isActive=true ")
	List<JobPostingDto> getAdvertisementDetailByActive();
	
	
}
