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
@Table(name="educations")
@AllArgsConstructor
@NoArgsConstructor
public class Education {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="school")
	private String school;
	
	@NotBlank
	@NotNull
	@Column(name="department")
	private String department;
	
	@NotBlank
	@NotNull
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="graduation_date")
	private LocalDate graduationDate;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobhunter;
}
