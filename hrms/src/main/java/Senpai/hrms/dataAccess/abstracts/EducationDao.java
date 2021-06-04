package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education,Integer> {

	
	List<Education>getByJobhunter_userIdOrderByGraduationDateDesc(int jobHunterId);
}
