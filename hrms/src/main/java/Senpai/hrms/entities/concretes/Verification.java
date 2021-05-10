package Senpai.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="verifications")
@Entity
public class Verification {
    @Id
    @GeneratedValue
    @Column(name="id")
	private int id;
    
    @Column(name="confirmed")
	private boolean confirmed;
    
    @Column(name="confirm_date")
	private LocalDate confirmDate;

    public Verification() {}
	public Verification(int id, boolean confirmed, LocalDate confirmDate) {
		super();
		this.id = id;
		
		this.confirmed = confirmed;
		this.confirmDate = confirmDate;
	}
}
