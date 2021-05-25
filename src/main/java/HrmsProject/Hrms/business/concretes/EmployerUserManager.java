package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.EmployerUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.EmployerUserDao;
import HrmsProject.Hrms.entities.concretes.EmployerUser;


@Service
public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;
	
	 @Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		
		this.employerUserDao = employerUserDao;
	}

	@Override
	public DataResult<List<EmployerUser>> getAll() {
		return new SuccessDataResult<List<EmployerUser>>
		(this.employerUserDao.findAll(),"Data listed");
	}

	@Override
	public Result add(EmployerUser employerUser) {
		employerUserDao.save(employerUser);
		return new SuccessResult("employerUser added");
	}

}
