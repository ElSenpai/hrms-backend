package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer> {

	Image getByJobhunter_userId(int jobHunterId);
}
