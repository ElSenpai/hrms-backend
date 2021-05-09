package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
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
	
	@Column(name="department_id")
	private int departmentId;
	public Employer() {}
	public Employer( String website, int phoneNumber, String companyName,int departmentId) {
		super();
		this.departmentId=departmentId;
		this.website = website;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
	}
}
