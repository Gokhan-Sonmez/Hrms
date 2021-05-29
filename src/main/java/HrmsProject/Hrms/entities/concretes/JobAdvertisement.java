package HrmsProject.Hrms.entities.concretes;

import java.math.BigDecimal;
import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="job_position_id")
//	private int jobPositionId;
//	
//	@Column(name="city_id")
//	private int cityId;
	
//	@Column(name="employer_id")
//	private int employerId;	
	
	@Column(name="min_salary")
	private BigDecimal minSalary;
	
	
	@Column(name="max_salary")
	private BigDecimal maxSalary;
	
	
	@Column(name="job_detail")
	private String jobDetail;
	
	@Column(name="open_position")
	private int openPosition;
	
	@Column(name="create_date")
	private LocalDate createDate;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="status")
	private Boolean status;
	
	@ManyToOne()
    @JoinColumn(name="city_id")
    private City city;

	@ManyToOne()
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;
	
	@ManyToOne()
    @JoinColumn(name="employer_id")
    private EmployerUser employerUser;



}