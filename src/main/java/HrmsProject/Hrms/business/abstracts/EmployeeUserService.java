package HrmsProject.Hrms.business.abstracts;

import java.util.List;

import HrmsProject.Hrms.core.utilities.results.DataResult;
import HrmsProject.Hrms.core.utilities.results.Result;
import HrmsProject.Hrms.entities.concretes.EmployeeUser;

public interface EmployeeUserService {
	
	DataResult<List<EmployeeUser>> getAll();

	
	
	Result add(EmployeeUser employeeUser);

	

}
