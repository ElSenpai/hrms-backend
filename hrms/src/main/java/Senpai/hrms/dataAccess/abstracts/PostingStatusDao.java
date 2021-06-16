package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.PostingStatus;

public interface PostingStatusDao extends JpaRepository<PostingStatus,Integer> {

}
