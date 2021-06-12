package Senpai.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employment_type")


@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPosting"})
public class EmploymentType {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="id")
	  private int id;
	  
	  @Column(name="name")
	  private String name;
	  
	  @JsonIgnore
	  @OneToMany (mappedBy="employmentType")	
	  private List<JobPosting> jobPosting;
	  
	
}
