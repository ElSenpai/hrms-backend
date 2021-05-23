package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	//@Id
	//@GeneratedValue
	//@Column(name="user_id")
	//private int userId;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	
}
