package HrmsProject.Hrms.business.abstracts;


import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllByEmployerUser(int employerId);
	
	DataResult<List<JobAdvertisement>> getAllByStatus(Boolean status);
	
	DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDate();
	
	DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployerUser_CompanyName(String companyName);

	Result add(JobAdvertisement jobAdvertisement);
}
