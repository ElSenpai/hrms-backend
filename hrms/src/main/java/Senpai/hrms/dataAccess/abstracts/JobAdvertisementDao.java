package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Senpai.hrms.entities.concretes.JobAdvertisement;
import Senpai.hrms.entities.dto.AdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

	@Query("From JobAdvertisement where isActive=true ")
	List<JobAdvertisement> getByIsActive();
	
	@Query("Select new Senpai.hrms.entities.dto.AdvertisementDto(j.id, e.companyName,j.name,j.openPositions,j.appDate,j.appDeadline,j.isActive) From Employer e Inner Join e.jobAdvertisement j ")
	List<AdvertisementDto> getByAdvertisementDetail();
	
	@Query("Select new Senpai.hrms.entities.dto.AdvertisementDto(j.id, e.companyName,j.name,j.openPositions,j.appDate,j.appDeadline,j.isActive) From Employer e Inner Join e.jobAdvertisement j Where j.isActive=true ")
	List<AdvertisementDto> getAdvertisementDetailByActive();
	
	
}
