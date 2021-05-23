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
@Table(name="verifications")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Verification {
    @Id
    @GeneratedValue
    @Column(name="id")
	private int id;
    
    @Column(name="confirmed")
	private boolean confirmed;
    
    @Column(name="confirm_date")
	private LocalDate confirmDate;

   
}
