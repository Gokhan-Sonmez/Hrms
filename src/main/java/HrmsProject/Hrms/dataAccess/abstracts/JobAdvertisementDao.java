package HrmsProject.Hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> getAllByEmployerUser(int employerId);
	List<JobAdvertisement> getAllByStatus(Boolean status);
	List<JobAdvertisement> getAllByDeadlineLessThanEqual(LocalDate date);
	
}
