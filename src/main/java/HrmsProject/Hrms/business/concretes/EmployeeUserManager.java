package HrmsProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.Hrms.business.abstracts.EmployeeUserService;
import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.core.utilities.results.SuccessDataResult;
import HrmsProject.Hrms.core.utilities.results.SuccessResult;
import HrmsProject.Hrms.dataAccess.abstracts.EmployeeUserDao;
import HrmsProject.Hrms.entities.concretes.EmployeeUser;


@Service
public class EmployeeUserManager implements EmployeeUserService {
	
	private EmployeeUserDao employeeUserDao;

	@Autowired
	public EmployeeUserManager(EmployeeUserDao employeeUserDao) {
		
		this.employeeUserDao = employeeUserDao;
	}

	@Override
	public DataResult<List<EmployeeUser>> getAll() {
		
		return new SuccessDataResult<List<EmployeeUser>>
		(employeeUserDao.findAll(),"Data listed");
	}

	@Override
	public Result add(EmployeeUser employeeUser) {
		
		employeeUserDao.save(employeeUser);
		return new SuccessResult("employeeUser added");
	}

}
