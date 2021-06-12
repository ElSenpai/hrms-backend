package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Senpai.hrms.entities.concretes.VerificationJobPosting;

public interface VerificationJobPostingDao extends JpaRepository<VerificationJobPosting,Integer> {
	

	@Query("From VerificationJobPosting where isConfirmed=true ")
    List<VerificationJobPosting> getByIsActive();
}
