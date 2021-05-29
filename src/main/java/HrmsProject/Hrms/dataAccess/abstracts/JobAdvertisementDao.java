package HrmsProject.Hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> getByEmployerUser_Id(int employerId);
	
	List<JobAdvertisement> getByStatus(Boolean status);
	
	List<JobAdvertisement> getByStatusTrueOrderByCreateDate();
	
	List<JobAdvertisement> getByStatusTrueAndEmployerUser_CompanyName(String companyName);
}
