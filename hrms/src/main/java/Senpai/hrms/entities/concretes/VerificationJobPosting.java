package Senpai.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_posting_verifications")
@Entity
public class VerificationJobPosting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirm_date")
	private LocalDate confirmDate;
	
	
	@OneToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="job_posting_id")
	private JobPosting jobPosting;
	
	
	
	@ManyToOne
	@JoinColumn(name="employee_id" )
	private Employee employee;
	
	
	
	

}
