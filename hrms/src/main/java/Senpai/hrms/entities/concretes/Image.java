package Senpai.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="images")
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="url")
	private String url;
	
	
	@NotNull
	@Column(name="update_date")
	private LocalDate updateDate;
	
	@OneToOne
	@JsonIgnore
	@JoinColumn(name="job_hunter_id")
	private JobHunter jobhunter;
}
