package Senpai.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobs")
public class Job {
    @Id
    @GeneratedValue
    @Column(name="id")
	private int jobId;
	
    @Column(name="name")
	private String name;
	
	
	public Job() {}
	public Job(int jobId, String name) {
		super();
		this.jobId = jobId;
		this.name = name;
	}
	
}
