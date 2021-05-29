package HrmsProject.Hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.JobAdvertisementService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import HrmsProject.Hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.findAll(),"data listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByEmployerUser(int employerId) {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.getByEmployerUser_Id(employerId));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByStatus(Boolean status) {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.getByStatus(status));
	}



	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("JobAdvertisement added");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusTrueOrderByCreateDate() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.getByStatusTrueOrderByCreateDate());
	
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByStatusTrueAndEmployerUser_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(jobAdvertisementDao.getByStatusTrueAndEmployerUser_CompanyName(companyName));
	}

}
