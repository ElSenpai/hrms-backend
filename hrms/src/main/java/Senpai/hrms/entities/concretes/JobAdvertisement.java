package Senpai.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")


@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	
	  @Id
	  @GeneratedValue
	  @Column(name="id")
	  private int id;
	
//	  @Column(name="employer_id")
//	  private int employerId;
	
	 // @Column(name="position_id")
	 // private int positionId;
	
	 // @Column(name="city_id")
	 // private int cityId;
	
	  @Column(name="requirements")
	  private String requirements;
	  
	  @Column(name="name")
	  private String name;
	
	  @Column(name="open_positions")
	  private int openPositions;
	
	  @Column(name="salary")
	  private int salary;
	
	  @Column(name="application_date")
	  private LocalDate appDate;
	
	  @Column(name="application_deadline")
	  private LocalDate appDeadline;
	
	  @Column(name="is_active")
	  private boolean isActive;
	  
	  @ManyToOne()
	  @JoinColumn(name="city_id")
	  private City city;
	
	  @ManyToOne()
	  @JoinColumn(name="position_id")
	  private Job jobs;
	  
	  @ManyToOne()
	  @JoinColumn(name="employer_id")
	  private Employer employer;
	
	
}
