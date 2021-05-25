package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.EmployerUser;

public interface EmployerUserService {

	DataResult<List<EmployerUser>> getAll();
	
	Result add(EmployerUser employerUser);
	
	
}
