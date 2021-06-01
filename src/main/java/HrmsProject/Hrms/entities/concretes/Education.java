package HrmsProject.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="educations")
public class Education {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="high_school")
	private String highSchool;
	
	@Column(name="university")
	private String university;
	
	@Column(name="department")
	private String department;
	
	@Column(name="graduate")
	private Boolean graduate;
	
	@Column(name="star_of_year")
	private Date starOfYear;
	
	@Column(name="finish_of_year")
	private Date finishOfYear;
	

}
