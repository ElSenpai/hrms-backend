package Senpai.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Employer extends User {
	//@Id
	//@GeneratedValue
	//@Column(name="user_id")
	//private int userId;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	   @OneToMany(mappedBy="employer")
	    private List<JobAdvertisement> jobAdvertisement;
	
}
