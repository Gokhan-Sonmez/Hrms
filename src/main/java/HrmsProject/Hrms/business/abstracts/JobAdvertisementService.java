package HrmsProject.Hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllByEmployerUser(int employerId);
	DataResult<List<JobAdvertisement>> getAllByStatus(Boolean status);
	DataResult<List<JobAdvertisement>> getAllByDeadlineLessThanEqual(LocalDate date);
	
	Result add(JobAdvertisement jobAdvertisement);
}
