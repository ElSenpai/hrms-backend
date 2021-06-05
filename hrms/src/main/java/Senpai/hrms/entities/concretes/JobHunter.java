package Senpai.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Senpai.hrms.core.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_hunters")
@PrimaryKeyJoinColumn(name = "user_id")

@AllArgsConstructor
@NoArgsConstructor
public class JobHunter extends User {
	//@Id
	//@GeneratedValue
	//@Column(name="user_id")
	//private int userId;
	
	@NotNull
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	@NotNull
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	
	@NotNull
	@Column(name="birth_date")
	private int birthDate;
	
	@NotNull
	@NotBlank
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@OneToOne(mappedBy="jobhunter", fetch=FetchType.LAZY)
	@JsonIgnore
	private Image image;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<Experience> experience;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<Ability> ability;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<Education> education;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<Language> language;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<Link> link;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobhunter")
	private List<CoverLetter> coverLetter;
	

}
