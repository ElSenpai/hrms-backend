package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User {
	//@Id
	//@GeneratedValue
	//@Column(name="user_id")
	//private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="company_id")
	private int companyId;
	
	public Employee() {}
	public Employee( String firstName, String lastName,int companyId) {
		super();
		this.companyId=companyId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

}
