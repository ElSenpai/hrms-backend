package Senpai.hrms.core.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)

@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
    @GeneratedValue
    @Column(name="user_id")
	private int userId;
    
	@NotNull
	@NotBlank
	@Email
	@Column(name="email")
	private String email;
	@NotNull
	@NotBlank
	@Column(name="password")
	private String password;

}
