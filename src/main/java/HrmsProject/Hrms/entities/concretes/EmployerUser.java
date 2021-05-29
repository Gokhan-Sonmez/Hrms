package HrmsProject.Hrms.entities.concretes;

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
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@AllArgsConstructor 
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class EmployerUser extends User {
	
	@Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employerUser")
	private List<JobAdvertisement> jobAdvertisement;

}
