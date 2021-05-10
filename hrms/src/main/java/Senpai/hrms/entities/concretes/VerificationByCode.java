package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="verify_employer_by_codes")
@PrimaryKeyJoinColumn(name="id")
public class VerificationByCode extends Verification {

	@Column(name="verification_code")
	private String verificationCode;
	
	@Column(name="employer_user_id")
	private int employerUserId;
	
	public VerificationByCode() {}
	public VerificationByCode(String verificationCode, int employerUserId) {
		super();
		this.verificationCode = verificationCode;
		this.employerUserId = employerUserId;
	}
	
}
