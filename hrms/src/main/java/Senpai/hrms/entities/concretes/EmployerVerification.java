package Senpai.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name="employers_verification")
@Entity
public class EmployerVerification {
 
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="activation_code")
	private String activationCode;
	
	@Column(name="employer_user_id")
	private int employerUserId;
	
	@Column(name="confirm_date")
	private LocalDate confirmDate;
	
	@Column(name="confirm_by_mail")
	private boolean confirmByMail;
	
	@Column(name="confirm_by_employee")
	private boolean confirmByEmployee;
	
	public EmployerVerification() {}
	public EmployerVerification(int id, String activationCode, int employerUserId, LocalDate confirmDate,
			boolean confirmByMail, boolean confirmByEmployee) {
		super();
		this.id = id;
		this.activationCode = activationCode;
		this.employerUserId = employerUserId;
		this.confirmDate = confirmDate;
		this.confirmByMail = confirmByMail;
		this.confirmByEmployee = confirmByEmployee;
	}
	
	
}
