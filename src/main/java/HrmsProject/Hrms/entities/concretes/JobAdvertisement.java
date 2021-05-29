package HrmsProject.Hrms.entities.concretes;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private int minSalary;
	
	
	@Column(name="max_salary")
	private int maxSalary;
	
	
	@Column(name="job_detail")
	private String jobDetail;
	
	@Column(name="open_position")
	private int openPosition;
	
	@Column(name="create_date", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createDate=LocalDate.now();
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="status")
	private Boolean status;
	
 
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="city_id")
    private City city;

	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="employer_id")
    private EmployerUser employerUser;



}