package Senpai.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="experiences")
@AllArgsConstructor
@NoArgsConstructor

public class Experience {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	//private int jobhunterId;
	
	@NotBlank
	@NotNull
	@Column(name="firm_name")
	private String firmName;
	
	@NotBlank
	@NotNull
	@Column(name="position")
	private String position;
	
	@NotBlank
	@NotNull
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="leave_date")
	private LocalDate leaveDate;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobhunter;
}
