package Senpai.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience,Integer> {
    List<Experience>getByJobhunter_userIdOrderByLeaveDateDesc(int jobHunterId);
}
