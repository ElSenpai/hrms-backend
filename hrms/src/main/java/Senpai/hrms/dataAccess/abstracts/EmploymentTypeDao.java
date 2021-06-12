package Senpai.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Senpai.hrms.entities.concretes.EmploymentType;

public interface EmploymentTypeDao extends JpaRepository<EmploymentType,Integer> {

}
