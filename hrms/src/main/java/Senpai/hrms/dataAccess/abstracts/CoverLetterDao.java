package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {

}
