package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="companies")
@Entity
public class Company {
 
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	public Company() {}
	public Company(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
}
