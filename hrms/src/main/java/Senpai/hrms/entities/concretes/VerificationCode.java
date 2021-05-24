package Senpai.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="verification_codes")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCode {

	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	
	 @Column(name="User_id")
	private int userId;
	
	 @Column(name="verification_code")
	 private String code;
	
	 @Column(name="confirm_date",columnDefinition = "Date default CURRENT_DATE")
		private LocalDate confirmDate=LocalDate.now();
	 
	
	
	
	
}
