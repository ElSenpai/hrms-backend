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
@Table(name="verify_employer_by_employees")
@PrimaryKeyJoinColumn(name="id")
@AllArgsConstructor
@NoArgsConstructor
public class VerificationByEmployee extends Verification {
	
	
	@Column(name="employee_user_id")
	private int employeeUserId;
	
	@Column(name="employer_user_id")
	private int employerUserId;

	

}
