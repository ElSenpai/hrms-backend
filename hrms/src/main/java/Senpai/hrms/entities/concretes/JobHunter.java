package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_hunters")
@PrimaryKeyJoinColumn(name = "user_id")
public class JobHunter extends User {
	//@Id
	//@GeneratedValue
	//@Column(name="user_id")
	//private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private int birthDate;
	
	@Column(name="national_identity")
	private String nationalIdentity;
	public JobHunter() {}
	public JobHunter( String firstName, String lastName, int birthDate, String nationalIdentity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.nationalIdentity = nationalIdentity;
	}

}
