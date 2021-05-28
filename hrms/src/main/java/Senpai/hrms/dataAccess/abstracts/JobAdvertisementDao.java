package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Senpai.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

	@Query("From JobAdvertisement where isActive=true ")
	List<JobAdvertisement> getByIsActive();
	
	//List<JobAdvertisement> getAllByActive(); eger bu yiyor ve sadece trueları getiriyorsa   - bu iki metod denenmemiştir.
	//List<JobAdvertisement> getAllByActiveNot(); bununda  tahminen falseları getirmesi lazım
	
}
