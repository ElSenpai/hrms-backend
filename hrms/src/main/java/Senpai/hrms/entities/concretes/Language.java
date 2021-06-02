package Senpai.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="languages")
@AllArgsConstructor
@NoArgsConstructor
public class Language {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="language")
	private String language;
	
	
	@NotNull
	@Min(1)
	@Max(5)
	@Column(name="level")
	private int level;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobhunter;
}
